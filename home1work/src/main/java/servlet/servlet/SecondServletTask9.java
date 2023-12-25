package servlet.servlet;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="Servlet2", value="/servlet2")

public class SecondServletTask9 extends HttpServlet {
    private int countHit;

    @Override
    public void init() throws ServletException {
        countHit = 0;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        countHit++;
        PrintWriter out = response.getWriter();
        String title = "Total numbers of hits";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#def2ce\">\n" +
                "<h1 align = \"center\">" + title + "</h1>\n" +
                "<h2 align = \"center\">" + countHit + "</h2>\n" +
                "</body> </html>");


        String cH = Integer.toString(countHit);
        FileWriter writer = new FileWriter("D:\\jd2_homework\\home1work\\src\\main\\webapp\\countHit.txt");
        writer.write(cH);
        writer.close();
    }}