package org.example.web;

import org.example.info.Info;
import org.example.model.Artist;
import org.example.model.Genre;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Servletfi extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        Info inf = Info.getInstance();
        HashMap<String,Integer> sortArtist = new HashMap();
        HashMap<String,Integer> sortGenres = new HashMap();
        HashMap<String,Date> sortDate = new HashMap();

        for(Artist artist: inf.Artists){
            sortArtist.put(artist.getName(),artist.getVote());
        }
        sortArtist.entrySet().stream().sorted();

        for(Genre genre: inf.Genres){
            sortGenres.put(genre.getName(),genre.getVote());
        }
        sortGenres.entrySet().stream().sorted();


        String s = "<p>Рейтинг исполнителей:</b></p><table><tbody><tr><th>Исполнитель</th><th>Кол-во голосов</th></tr>";
        for(Map.Entry<String,Integer> pair: sortArtist.entrySet()){
            s = s + "<tr><td>" + pair.getKey() + "</td><td>" + pair.getValue() + "</td></tr>";
        }
        s = s + "</tbody></table>";

        String p = "<p>Рейтинг жанров:</b></p><table><tbody><tr><th>Жанр</th><th>Кол-во голосов</th></tr>";
        for(Map.Entry<String,Integer> pair: sortGenres.entrySet()){
           p =p + "<tr><td>" + pair.getKey() + "</td><td>" + pair.getValue() + "</td></tr>";
        }
        p = p + "</tbody></table>";

        PrintWriter writer = resp.getWriter();
        writer.write(s + "<Br>" + p + "<Br>");



    }
}
