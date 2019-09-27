package edu.uc.gamelibrarymanager.dao;

import edu.uc.gamelibrarymanager.dto.UserDTO;

/**
 * Data methods for the User Object
 * @author Samuel Curry
 * */

public interface IUserDAO {
    /**
     * Fetches the User by ID
     * @param id the id of the user to retrieve
     * @throws Exception any problem in the underlying query
     * */
    public UserDTO fetchById(int id) throws Exception;

    /**
     * Creates the User
     * @param user the User object to create the UserDTO with
     * @throws Exception any problem in the underlying persistence
     * */
    public UserDTO create(UserDTO user) throws Exception;

    /**
     * Tries to locate the user by username and password, returns null if nothing is found
     * @param username the username of the user you are trying to locate
     * @param password the password of the user you are trying to locate
     * @throws Exception any problem in the underlying query
     * */
    public UserDTO login(String username, String password) throws Exception;
}
