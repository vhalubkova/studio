package org.example.model;


import java.util.Date;
import java.util.HashMap;

public class Form {
    private String info;
    private Date dateVote;
    private String artist;
    private String [] genres;

    public Form(String artist,String [] genres,String info,Date dateVote){
        this.artist = artist;
        this.genres = genres;
        this.info = info;
        this.dateVote = dateVote;
    }
    public String getArtist(){
        return artist;
    }
    public String [] getGenres(){
        return genres;
    }
    public String getInfo(){
        return info;
    }
    public Date getDateVote(){
        return dateVote;
    }
}
