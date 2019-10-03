package edu.uc.gamelibrarymanager.service;

import edu.uc.gamelibrarymanager.dao.IGameDAO;
import edu.uc.gamelibrarymanager.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class GameServiceStub implements IGameService{

    private final IGameDAO gameDAO;

    @Autowired
    public GameServiceStub(IGameDAO gameDAO) {
        this.gameDAO = gameDAO;
    }

    /**
     * Fetches the game by ID
     *
     * @param id the id of the game to retrieve
     * @return returns the GameDTO, if found, otherwise Optional.empty
     * @throws Exception any problem in the underlying query
     */
    @Override
    public Optional<GameDTO> fetchById(int id) throws Exception {
        return gameDAO.fetchById(id);
    }

    /**
     * Fetches the game by Steam ID
     *
     * @param steamId the steam ID of the game to retrieve
     * @return returns the GameDTO, if found, otherwise Optional.empty
     * @throws Exception any problem in the underlying query
     */
    @Override
    public Optional<GameDTO> fetchGameBySteamId(String steamId) throws Exception {
        return gameDAO.fetchGameBySteamId(steamId);
    }

    /**
     * Creates the game with the given GameDTO object
     *
     * @param game the game to create
     * @return returns the GameDTO that was created
     * @throws Exception any problem in the underlying persistence
     */
    @Override
    public GameDTO create(GameDTO game) throws Exception {
        return gameDAO.create(game);
    }

    /**
     * Updates the game by the given ID with the given GameDTO
     *
     * @param id   the game to update
     * @param game the game object to update the game with
     * @return returns the updated GameDTO, if found by ID, otherwise Optional.empty
     * @throws Exception any problem in the underlying persistence
     */
    @Override
    public Optional<GameDTO> update(String id, GameDTO game) throws Exception {
        return gameDAO.update(id, game);
    }

    /**
     * Grabs the list of owned games from a steam user
     *
     * @param steamUserId the steam user ID of the user you want the game list for
     * @param apiUserId   the ID of the user that is requesting the list of owned games
     * @return returns the list of owned games, if found by ID, otherwise Optional.empty
     */
    @Override
    public Optional<GameDTO[]> getOwnedGamesForSteamUser(String steamUserId) throws Exception {
        GameDTO[] gameDTOs = new GameDTO[2];
        gameDTOs[0] = new GameDTO("123", "Test", "qweqwe", "I", 1, "123", "123", 1, 0.5, 1 );
        gameDTOs[1] = new GameDTO("123", "Test1234", "qweqwe", "I", 1, "123", "123", 1, 0.5, 1 );
        return Optional.of(gameDTOs);
    }
}
