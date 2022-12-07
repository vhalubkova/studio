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

public class Servlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        Info inf = Info.getInstance();
        PrintWriter writer = resp.getWriter();
        String s = "<form method='post' action='s'><p><b>Выберите Ваши любимые жанры (3-5шт):</b></p>";
        for(Genre genre:inf.Genres){
            s = s + "<input type='checkbox' name='genre' value='" + genre.getID() + "'> " + genre.getName() + "<Br>";
        }
        s = s + "<p><input type='submit' value='Отправить'></p> </form>";

        writer.write(s);
    }
}
