package edu.uc.gamelibrarymanager;

import edu.uc.gamelibrarymanager.dto.GameDTO;
import edu.uc.gamelibrarymanager.edu.uc.gamelibrarymanager.service.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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
}
