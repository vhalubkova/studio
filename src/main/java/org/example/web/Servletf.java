package org.example.web;

import org.example.info.Info;
import org.example.model.Artist;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servletf extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        Info inf = Info.getInstance();
        String s = "<form method='post' action='s'><p><b>Какого исполнителя Вы считаете лучшим?</b></p>";
        for(Artist artist:inf.Artists){
           s = s + "<input type='radio' name='artist' value='" + artist.getID() + "'> " + artist.getName() + "<Br>";
        }
        s = s + "<p><input type='submit' value='Отправить'></p> </form>";
        PrintWriter writer = resp.getWriter();
        writer.write(s);
    }
}
