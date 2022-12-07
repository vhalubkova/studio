package org.example.model;

public class Artist implements Music {
    private String name;
    private int ID;
    private int vote=0;
    public Artist(int ID,String name){
        this.name = name;
        this.ID = ID;
    }
    public int getVote(){
        return vote;
    }
    public String getName(){
        return name;
    }
    public void setVote(){
        vote++;
    }
    public int getID(){
        return ID;
    }
}
