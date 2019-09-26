package edu.uc.gamelibrarymanager.dto;

public class UserDTO {
    private int guid;
    private String username;
    private String hashedPassword;
    private int steamGuid;

    public int getGuid() {
        return guid;
    }

    public void setGuid(int guid) {
        this.guid = guid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public int getSteamGuid() {
        return steamGuid;
    }

    public void setSteamGuid(int steamGuid) {
        this.steamGuid = steamGuid;
    }

}
