package org.example.info;

import org.example.model.Artist;
import org.example.model.Genre;

import java.util.ArrayList;
import java.util.HashMap;

public class Info {
    private static Info single_instance = null;

    public ArrayList<Artist> Artists = new ArrayList<>();
    public ArrayList<Genre> Genres = new ArrayList<>();

    private Info(){
        Artists.add(new Artist(1,"Aerosmith"));
        Artists.add(new Artist(2,"Thegiornalisti"));
        Artists.add(new Artist(3,"Chris Rea"));
        Artists.add(new Artist(4,"Paul Mauriat"));
        Genres.add(new Genre(101,"Classic"));
        Genres.add(new Genre(102,"Jazz"));
        Genres.add(new Genre(103,"Folk"));
        Genres.add(new Genre(104,"Rock"));
        Genres.add(new Genre(105,"Indie"));
        Genres.add(new Genre(106,"Blues"));
        Genres.add(new Genre(107,"Electro"));
        Genres.add(new Genre(108,"Funk"));
        Genres.add(new Genre(109,"Techno"));
        Genres.add(new Genre(110,"Rap"));
    }


    public static Info getInstance(){
        if (single_instance == null)
            single_instance = new Info();
        return single_instance;
    }
}



