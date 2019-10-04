package edu.uc.gamelibrarymanager.dao;

import edu.uc.gamelibrarymanager.dto.UserDTO;

import java.util.Optional;

/**
 * Data methods for the User Object
 * @author Samuel Curry
 * */

public interface IUserDAO {
    /**
     * Fetches the User by ID
     * @param id the id of the user to retrieve
     * @return returns a UserDTO wrapped in an Optional
     * @throws Exception any problem in the underlying query
     * */
    Optional<UserDTO> fetchById(String id) throws Exception;

    /**
     * Creates the User
     * @param user the User object to create the UserDTO with
     * @return returns the UserDTO that was created
     * @throws Exception any problem in the underlying persistence
     * */
    UserDTO create(UserDTO user) throws Exception;

    /**
     * Tries to locate the user by username and password, returns null if nothing is found
     * @param username the username of the user you are trying to locate
     * @param password the password of the user you are trying to locate
     * @return returns the UserDTO, if authenticated, wrapped in an optional. Optional.empty if not authenticated.
     * @throws Exception any problem in the underlying query
     * */
    Optional<UserDTO> login(String username, String password) throws Exception;
}
