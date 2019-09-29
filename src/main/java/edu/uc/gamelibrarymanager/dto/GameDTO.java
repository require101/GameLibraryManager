package edu.uc.gamelibrarymanager.dto;

public class GameDTO {

    private int guid;
    private String name;
    private String icon;
    private boolean isComplete;
    private int rating;
    private String steamGameID;
    private int owningUserId;
    private int cost;
    private int numPlaythroughs;
    private double percentSideMissionsCompleted;
    private int numEndingsCompleted;

    public GameDTO(
            int guid,
            String name,
            String icon,
            boolean isComplete,
            int rating,
            String steamGameID,
            int owningUserId,
            int cost,
            int numPlaythroughs,
            double percentSideMissionsCompleted,
            int numEndingsCompleted) {
        this.guid = guid;
        this.name = name;
        this.icon = icon;
        this.isComplete = isComplete;
        this.rating = rating;
        this.steamGameID = steamGameID;
        this.owningUserId = owningUserId;
        this.cost = cost;
        this.numPlaythroughs = numPlaythroughs;
        this.percentSideMissionsCompleted = percentSideMissionsCompleted;
        this.numEndingsCompleted = numEndingsCompleted;
    }

    public int getGuid() {
        return guid;
    }

    public void setGuid(int guid) {
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

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
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

    public int getOwningUserId() {
        return owningUserId;
    }

    public void setOwningUserId(int owningUserId) {
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
