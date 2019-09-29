package edu.uc.gamelibrarymanager.dao;

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
                1234,
                "Test",
                "qweqweqwe",
                false,
                1,
                "123123",
                123123,
                30, 4,
                2.5d,
                2 );
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
                1234,
                "Test",
                "qweqweqwe",
                false,
                1,
                "123123",
                123123,
                30, 4,
                2.5d,
                2 );
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
        if(game.getName().isBlank()){
            throw new Exception("Game name cannot be null or empty.");
        }
        game.setGuid(1234);
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
    public Optional<GameDTO> update(int id, GameDTO game) throws Exception {
        if(id < 0){
            throw new Exception("ID cannot be negative");
        }
        return Optional.of(game);
    }
}
