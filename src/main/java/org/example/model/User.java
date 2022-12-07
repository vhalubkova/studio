package org.example.model;

import java.util.Date;

public class User {
    private int artistID;
    private int[] genreIDs;
    private String textAboutUser;
    private Date date;

    public int getArtistID() {
        return artistID;
    }

    public void setArtist(int artistID) {
        this.artistID = artistID;
    }

    public int[] getGenreID() {
        return genreIDs;
    }

    public void setGenre(int[] genreIDs) {
        this.genreIDs = genreIDs;
    }

    public String gettextAboutUser() {
        return textAboutUser;
    }

    public void settextAboutUser(String textAboutUser) {
        this.textAboutUser = textAboutUser;
    }
    public void setDate(){
        date = new Date();
    }
    public Date getDate(){
        return date;
    }
}
