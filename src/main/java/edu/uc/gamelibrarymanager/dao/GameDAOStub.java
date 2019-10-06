package edu.uc.gamelibrarymanager.dao;

import com.google.common.base.Strings;
import edu.uc.gamelibrarymanager.dto.GameDTO;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GameDAOStub implements IGameDAO {
    /**
     * Fetches the game by ID
     * @param id the id of the game to retrieve
     * @throws Exception any problem in the underlying query
     * @return returns the GameDTO, if found, otherwise Optional.empty
     * */
    @Override
    public Optional<GameDTO> fetchById(int id) throws Exception {
        GameDTO mockDTO = new GameDTO(
                "1234",
                "Test",
                "qweqweqwe",
                "I",
                1,
                "123123",
                "123123",
                30, 4,
                2);
        return Optional.of(mockDTO);
    }

    /**
     * Fetches the game by Steam ID
     * @param steamId the steam ID of the game to retrieve
     * @throws Exception any problem in the underlying query
     * @return returns the GameDTO, if found, otherwise Optional.empty
     * */
    @Override
    public Optional<GameDTO> fetchGameBySteamId(String steamId) throws Exception {
        GameDTO mockDTO = new GameDTO(
                "1234",
                "Test",
                "qweqweqwe",
                "I",
                1,
                "123123",
                "123123",
                30, 4,
                2);
        return Optional.of(mockDTO);
    }

    /**
     * Creates the game with the given GameDTO object
     * @param game the game to create
     * @throws Exception any problem in the underlying persistence
     * @return returns the GameDTO that was created
     * */
    @Override
    public GameDTO create(GameDTO game) throws Exception {
        if(Strings.isNullOrEmpty(game.getName())){
            throw new Exception("Game name cannot be null or empty.");
        }
        game.setGuid("1234");
        return game;
    }

    /**
     * Updates the game by the given ID with the given GameDTO
     * @param id the game to update
     * @param game the game object to update the game with
     * @throws Exception any problem in the underlying persistence
     * @return returns the updated GameDTO, if found by ID, otherwise Optional.empty
     * */
    @Override
    public Optional<GameDTO> update(String id, GameDTO game) throws Exception {
        if(Strings.isNullOrEmpty(id)){
            throw new Exception("ID cannot be null or empty");
        }
        return Optional.of(game);
    }
}
