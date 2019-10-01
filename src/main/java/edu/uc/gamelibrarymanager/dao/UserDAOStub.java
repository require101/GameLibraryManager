package edu.uc.gamelibrarymanager.dao;

import edu.uc.gamelibrarymanager.dto.UserDTO;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDAOStub implements IUserDAO {
    /**
     * Fetches the User by ID
     * @param id the id of the user to retrieve
     * @return returns a UserDTO wrapped in an Optional
     * @throws Exception any problem in the underlying query
     * */
    @Override
    public Optional<UserDTO> fetchById(int id) throws Exception {
        if(id < 0){
            throw new Exception("ID cannot be negative");
        }
        return Optional.of(new UserDTO("12f", "123b"));
    }

    /**
     * Creates the User
     * @param user the User object to create the UserDTO with
     * @return returns the UserDTO that was created
     * @throws Exception any problem in the underlying persistence
     * */
    @Override
    public UserDTO create(UserDTO user) throws Exception {
        if(user.getSteamGuid().isBlank()){
            throw new Exception("SteamGUID cannot be null or empty");
        }
        return new UserDTO("12f", "123b");
    }

    /**
     * Tries to locate the user by username and password, returns null if nothing is found
     * @param username the username of the user you are trying to locate
     * @param password the password of the user you are trying to locate
     * @return returns the UserDTO, if authenticated, wrapped in an optional. Optional.empty if not authenticated.
     * @throws Exception any problem in the underlying query
     * */
    @Override
    public Optional<UserDTO> login(String username, String password) throws Exception {
        if(username.isBlank() || password.isBlank()){
            throw new Exception("Username and password cannot be null or empty");
        }

        return Optional.of(new UserDTO("12f", "123b"));
    }
}
