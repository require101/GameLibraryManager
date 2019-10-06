package edu.uc.gamelibrarymanager.dto;


import edu.uc.gamelibrarymanager.security.FirebaseUser;

import javax.validation.constraints.NotNull;

public class UserDTO extends FirebaseUser implements Cloneable {

    private String firebaseUserId;

    @NotNull
    private String steamGuid;

    public UserDTO(String firebaseUserId, String steamGuid, String email, String id) {
        super(email, id);
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

    /**
     * Method for deep cloning the UserDTO to create new memory address
     * */
    public Object clone(){
        try {
            return  super.clone();
        } catch (CloneNotSupportedException e){
            //if not cloneable, just recreate object
            return new UserDTO(this.firebaseUserId, this.steamGuid, super.getUsername(), this.getId());
        }
    }
}
