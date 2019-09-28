package edu.uc.gamelibrarymanager.dao;

import edu.uc.gamelibrarymanager.dto.GameDTO;

import java.util.Optional;

public class GameDAOStub implements IGameDAO {
    /**
     * Fetches the game by ID
     *
     * @param id the id of the game to retrieve
     * @throws Exception any problem in the underlying query
     */
    @Override
    public Optional<GameDTO> fetchById(int id) throws Exception {
        return Optional.empty();
    }

    /**
     * Fetches the game by Steam ID
     *
     * @param steamId the steam ID of the game to retrieve
     * @throws Exception any problem in the underlying query
     */
    @Override
    public GameDTO fetchGameBySteamId(String steamId) throws Exception {
        return null;
    }

    /**
     * Creates the game with the given GameDTO object
     *
     * @param game the game to create
     * @throws Exception any problem in the underlying persistence
     */
    @Override
    public GameDTO create(GameDTO game) throws Exception {
        if(game.getName().isBlank()){
            
        }
    }

    /**
     * Updates the game by the given ID with the given GameDTO
     *
     * @param id   the game to update
     * @param game the game object to update the game with
     * @throws Exception any problem in the underlying persistence
     */
    @Override
    public GameDTO update(int id, GameDTO game) throws Exception {
        return null;
    }
}
