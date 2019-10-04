package edu.uc.gamelibrarymanager.dto;


import edu.uc.gamelibrarymanager.security.FirebaseUser;

import javax.validation.constraints.NotNull;

public class UserDTO extends FirebaseUser {

    //this will be null until persisted
    private String guid;

    @NotNull
    private String firebaseUserId;

    @NotNull
    private String steamGuid;

    public UserDTO(String firebaseUserId, String steamGuid, String email, String uid) {
        super(email, uid);
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
