package edu.uc.gamelibrarymanager.edu.uc.gamelibrarymanager.service;

import edu.uc.gamelibrarymanager.dao.IUserDAO;
import edu.uc.gamelibrarymanager.dao.UserDAOStub;
import edu.uc.gamelibrarymanager.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceStub implements IUserService {

    private final IUserDAO userDAO;

    @Autowired
    public UserServiceStub(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }

    /**
     * Gets the User by ID
     *
     * @param id the id of the user to retrieve
     * @return returns UserDTO, if found, otherwise Optional.Empty
     * @throws Exception any problem in the underlying query
     */
    @Override
    public Optional<UserDTO> getById(int id) throws Exception {
        return userDAO.fetchById(1234);
    }

    /**
     * Creates the User with the given UserDTO data
     *
     * @param user the User object to create the database document with
     * @return returns the created UserDTO
     * @throws Exception any problem in the underlying persistence
     */
    @Override
    public UserDTO create(UserDTO user) throws Exception {
        return userDAO.create(user);
    }

    /**
     * Tries to locate the user and verify him/her for login
     *
     * @param username the username of the user to try to login with
     * @param password the password of the user to try to login with
     * @return UserDTO if valid login, otherwise Optional.empty
     */
    @Override
    public Optional<UserDTO> login(String username, String password) throws Exception {
        return userDAO.login(username, password);
    }
}
