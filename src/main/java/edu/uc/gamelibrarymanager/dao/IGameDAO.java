package edu.uc.gamelibrarymanager.dao;

import edu.uc.gamelibrarymanager.dto.GameDTO;

public interface IGameDAO {
    GameDTO fetchById(int id) throws Exception;
    GameDTO fetchGameBySteamId(String steamId) throws Exception;
    GameDTO create(GameDTO game) throws Exception;
    GameDTO update(int id, GameDTO game) throws Exception;
}
