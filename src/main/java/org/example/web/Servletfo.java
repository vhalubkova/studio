package org.example.web;

import org.example.info.Info;
import org.example.model.Artist;
import org.example.model.Genre;
import org.example.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class Servletfo extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html; charset=UTF-8");
        Info inf = Info.getInstance();
        Map<String,String[]> inputParams = null;
        inputParams = req.getParameterMap();


        User user = new User();
        String[] s = inputParams.get("artist");
        if(s.length!=1){
            throw new IOException();
        }
        int artistID = Integer.parseInt(s[0]);
        user.setArtist(artistID);
        //можно сделать проверку на наличие в принципе такого артиста

        String[] v = inputParams.get("genre");
        if(v.length < 3 || v.length > 5){
            throw new IOException();
        }
        int[] genreID = new int[v.length];
        for(int i = 0; i < v.length; i++){
            genreID[i] = Integer.parseInt(v[i]);
        }
        user.setGenre(genreID);

        String[] t = inputParams.get("text");
        if(t.length != 1){
            throw new IOException();
        }
        user.settextAboutUser(t[0]);
        user.setDate();


        for (Artist artist: inf.Artists){
            if(user.getArtistID() == artist.getID()){
                artist.setVote();
            }
        }

        for (Genre genre: inf.Genres){
            for(int i = 0; i < user.getGenreID().length; i++){
                if(user.getGenreID()[i] == genre.getID()){
                    genre.setVote();
                }
            }

        }
    }
}
