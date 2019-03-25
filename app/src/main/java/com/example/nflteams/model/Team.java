package com.example.nflteams.model;

public class Team {
    private String name;
    public String imageUrl;
    private String[] keyPlayers;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


    public String[] getKeyPlayers() {
        return keyPlayers;
    }

    public void setKeyPlayers(String[] keyPlayers) {
        this.keyPlayers = keyPlayers;
    }


//////////////////////////////Connecter l'adapter sur la deuxième activité, connecter l'adapter à l'api et au données
}
