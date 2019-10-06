package edu.uc.gamelibrarymanager.dto;

import javax.validation.constraints.NotNull;

public class GameDTO {
    //guid will start out as null until persisted
    private String guid;

    @NotNull
    private String name;

    @NotNull
    private String icon;

    @NotNull
    private String progressStatus;

    @NotNull
    private int rating;

    @NotNull
    private String steamGameID;

    @NotNull
    private String owningUserId;

    @NotNull
    private int cost;

    @NotNull
    private int numPlaythroughs;

    @NotNull
    private double percentSideMissionsCompleted;

    @NotNull
    private int numEndingsCompleted;

    public GameDTO(
            String guid,
            String name,
            String icon,
            String progressStatus,
            int rating,
            String steamGameID,
            String owningUserId,
            int numPlaythroughs,
            double percentSideMissionsCompleted,
            int numEndingsCompleted) {
        this.guid = guid;
        this.name = name;
        this.icon = icon;
        this.progressStatus = progressStatus;
        this.rating = rating;
        this.steamGameID = steamGameID;
        this.owningUserId = owningUserId;
        this.numPlaythroughs = numPlaythroughs;
        this.percentSideMissionsCompleted = percentSideMissionsCompleted;
        this.numEndingsCompleted = numEndingsCompleted;
    }


    public String getProgressStatus() {
        return progressStatus;
    }

    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getSteamGameID() {
        return steamGameID;
    }

    public void setSteamGameID(String steamGameID) {
        this.steamGameID = steamGameID;
    }

    public String getOwningUserId() {
        return owningUserId;
    }

    public void setOwningUserId(String owningUserId) {
        this.owningUserId = owningUserId;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumPlaythroughs() {
        return numPlaythroughs;
    }

    public void setNumPlaythroughs(int numPlaythroughs) {
        this.numPlaythroughs = numPlaythroughs;
    }

    public double getPercentSideMissionsCompleted() {
        return percentSideMissionsCompleted;
    }

    public void setPercentSideMissionsCompleted(double percentSideMissionsCompleted) {
        this.percentSideMissionsCompleted = percentSideMissionsCompleted;
    }

    public int getNumEndingsCompleted() {
        return numEndingsCompleted;
    }

    public void setNumEndingsCompleted(int numEndingsCompleted) {
        this.numEndingsCompleted = numEndingsCompleted;
    }
}
