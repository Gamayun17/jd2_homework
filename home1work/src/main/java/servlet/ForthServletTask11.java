package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "browsers", urlPatterns = "/ForthServletTask11" )

public class ForthServletTask11 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getHeader("User-Agent");
        String browser = getBrowser(name);


        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<html><head><title>Forth Servlet</title></head>");
        writer.println("<body><h1>" + "Hello user" + browser + "</h1>");
        writer.println("</body></html>");

    }

    private String getBrowser(String name) {if (name.contains("Firefox")) {
        return "Firefox";
    } else if (name.contains("Yowser")) {
        return "Yandex";
    } else if (name.contains("Opera")) {
        return "Opera";
    } else if (name.contains("Edg")) {
        return "Microsoft Edge";
    } else if (name.contains("Chrome")) {
        return "Chrome";
    } else if (name.contains("Safari")) {
        return "Safari";
    } else if (name.contains("MSIE")) {
        return "Internet Explorer";
    } else {
        return "Unknown browser";
    }
    }


}
