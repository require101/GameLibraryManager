package edu.uc.gamelibrarymanager;

import edu.uc.gamelibrarymanager.dto.GameDTO;
import edu.uc.gamelibrarymanager.edu.uc.gamelibrarymanager.service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("game")
public class GameController {
    @Autowired
    private IGameService gameService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/")
    ResponseEntity createGame(@RequestBody @Valid GameDTO newGame){
        try {
            Assert.notNull(gameService, "Game service is null -- check DI container");
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(gameService.create(newGame));
        } catch (Exception e){
            //do not expose error to end user because of security stuff
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while saving the game");
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    ResponseEntity updateGame(@PathVariable("id") String id, @RequestBody @Valid GameDTO game){
        try {
            Assert.notNull(gameService, "Game service is null -- check DI container");
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(gameService.update(id, game));
        } catch (Exception e){
            //do not expose error to end user because of security stuff
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while updating the game");
        }
    }

    //since we do not implement authentication we cannot grab user ID from a token/session, so let anyone pass whatever ID they want into this endpoint
    @RequestMapping(value = "/owned-games/user/${userId}/steam-user-id/${steamUserId}", method = RequestMethod.POST)
    ResponseEntity importOwnedGamesForSteamUser(@PathVariable("steamUserId") String steamUserId, @PathVariable("userId") String userId){
        try {
            Assert.notNull(gameService, "Game service us null -- check DI container");
            Optional<GameDTO[]> ownedGames = gameService.getOwnedGamesForSteamUser(steamUserId);
            if(!ownedGames.isPresent()){
                return (ResponseEntity) ResponseEntity
                        .status(HttpStatus.NO_CONTENT);
            }
            for(int i = 0; i < ownedGames.get().length; i++){
                ownedGames.get()[i].setOwningUserId(userId);
                GameDTO savedGame = gameService.create(ownedGames.get()[i]);
                ownedGames.get()[i].setGuid(savedGame.getGuid());
            }
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(ownedGames);
        } catch (Exception e){
            //do not expose error to end user because of security stuff
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while updating the game");
        }
    }
}
