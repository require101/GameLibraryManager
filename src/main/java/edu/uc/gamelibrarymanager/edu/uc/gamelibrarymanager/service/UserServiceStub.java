package edu.uc.gamelibrarymanager.edu.uc.gamelibrarymanager.service;

import edu.uc.gamelibrarymanager.dto.UserDTO;

import java.util.Optional;

public class UserServiceStub implements IUserService {
    /**
     * Gets the User by ID
     *
     * @param id the id of the user to retrieve
     * @throws Exception any problem in the underlying query
     */
    @Override
    public UserDTO getById(int id) throws Exception {
        return null;
    }

    /**
     * Creates the User with the given UserDTO data
     *
     * @param user the User object to create the database document with
     * @throws Exception any problem in the underlying persistence
     */
    @Override
    public UserDTO create(UserDTO user) throws Exception {
        return null;
    }

    /**
     * Tries to locate the user and verify him/her for login
     *
     * @param username the username of the user to try to login with
     * @param password the password of the user to try to login with
     */
    @Override
    public Optional<UserDTO> login(String username, String password) throws Exception {
        return Optional.empty();
    }
}
