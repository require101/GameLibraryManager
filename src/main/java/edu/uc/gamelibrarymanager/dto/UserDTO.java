package edu.uc.gamelibrarymanager.dto;

public class UserDTO {
    private String firebaseUserId;
    private String steamGuid;

    public UserDTO(String firebaseUserId, String steamGuid) {
        this.firebaseUserId = firebaseUserId;
        this.steamGuid = steamGuid;
    }

    public String getFirebaseUserId() {
        return firebaseUserId;
    }

    public void setFirebaseUserId(String firebaseUserId) {
        this.firebaseUserId = firebaseUserId;
    }

    public String getSteamGuid() {
        return steamGuid;
    }

    public void setSteamGuid(String steamGuid) {
        this.steamGuid = steamGuid;
    }
}
