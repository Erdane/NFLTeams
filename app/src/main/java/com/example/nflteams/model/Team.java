package com.example.nflteams.model;

public class Team {
    private String name;
   // public String imageUrl;
    private int id;

   /* public Team(Context context) {
        super(context);
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*public String getImageUrl() {
        return imageUrl;
    }*/

    /*public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }*/
    public int getId(){
        return id;
    }

    public void setId(int in) {
        this.id = id;
    }


}
