package edu.uc.gamelibrarymanager.dao;

import edu.uc.gamelibrarymanager.dto.UserDTO;

public interface IUserDAO {
    UserDTO fetchByUsername(String username) throws Exception;
    UserDTO fetchById(int id) throws Exception;
    UserDTO create(UserDTO user) throws Exception;
}
