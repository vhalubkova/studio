package org.example.web;

import org.example.info.Info;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servletth extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        Info inf = Info.getInstance();
        PrintWriter writer = resp.getWriter();
        writer.write("<form method='post' action='s'><p><b>Расскажите о себе:</b></p>" +
                "<p><textarea rows='10' cols='45' name='text'></textarea></p>" +
                "<Br>"+
                "<p><input type='submit' value='Отправить'></p> </form>"
        );
    }
}
