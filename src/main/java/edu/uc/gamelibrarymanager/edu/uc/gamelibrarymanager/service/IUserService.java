package edu.uc.gamelibrarymanager.edu.uc.gamelibrarymanager.service;

import edu.uc.gamelibrarymanager.dto.UserDTO;

import java.util.Optional;

/**
 * Service methods for the User Object
 * @author Samuel Curry
 * */

public interface IUserService {

    /**
     * Gets the User by ID
     * @param id the id of the user to retrieve
     * @throws Exception any problem in the underlying query
     * @return returns UserDTO, if found, otherwise Optional.Empty
     * */
    public Optional<UserDTO> getById(int id) throws Exception;

    /**
     * Creates the User with the given UserDTO data
     * @param user the User object to create the database document with
     * @throws Exception any problem in the underlying persistence
     * @return returns the created UserDTO
     * */
    public UserDTO create(UserDTO user) throws Exception;

    /**
     * Tries to locate the user and verify him/her for login
     * @param username the username of the user to try to login with
     * @param password the password of the user to try to login with
     * @return UserDTO if valid login, otherwise Optional.empty
     * */
    public Optional<UserDTO> login(String username, String password) throws Exception;

}
