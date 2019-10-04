package edu.uc.gamelibrarymanager.service;

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
    Optional<UserDTO> getById(String id) throws Exception;

    /**
     * Creates the User with the given UserDTO data
     * @param user the User object to create the database document with
     * @throws Exception any problem in the underlying persistence
     * @return returns the created UserDTO
     * */
    UserDTO create(UserDTO user) throws Exception;

}
