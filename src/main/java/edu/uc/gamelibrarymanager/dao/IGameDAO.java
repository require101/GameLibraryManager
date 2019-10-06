package edu.uc.gamelibrarymanager.dao;

import edu.uc.gamelibrarymanager.dto.GameDTO;

import java.util.Optional;

/**
 * Data methods for the Game Object
 * @author Samuel Curry
 * */

public interface IGameDAO {
    /**
     * Fetches the game by ID
     * @param id the id of the game to retrieve
     * @throws Exception any problem in the underlying query
     * @return returns the GameDTO, if found, otherwise Optional.empty
     * */
    Optional<GameDTO> fetchById(int id) throws Exception;

    /**
     * Fetches the game by Steam ID
     * @param steamId the steam ID of the game to retrieve
     * @throws Exception any problem in the underlying query
     * @return returns the GameDTO, if found, otherwise Optional.empty
     * */
    Optional<GameDTO> fetchGameBySteamId(String steamId) throws Exception;

    /**
     * Creates the game with the given GameDTO object
     * @param game the game to create
     * @throws Exception any problem in the underlying persistence
     * @return returns the GameDTO that was created
     * */
    GameDTO create(GameDTO game) throws Exception;

    /**
     * Updates the game by the given ID with the given GameDTO
     * @param id the game to update
     * @param game the game object to update the game with
     * @throws Exception any problem in the underlying persistence
     * @return returns the updated GameDTO, if found by ID, otherwise Optional.empty
     * */
    Optional<GameDTO> update(String id, GameDTO game) throws Exception;
}
