package servlet.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;



@WebServlet(name = "Servlet3", urlPatterns = "/servlet3")


public class ThirdServletTask10 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String name = request.getParameter("name");
        System.out.println("Name:" + name);
        String phone = request.getParameter("phone");
        System.out.println("Phone:" + phone);
        String email = request.getParameter("email");
        System.out.println("Email:" + email);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (name.isEmpty() || (phone.isEmpty()&& email.isEmpty())) {
            out.println("<html>");
            out.println("<h1>" + "Error" + "<h1>");
        } else {
            out.println("<html><h1> User information </h1>");
            out.println("<a>" + name + "</a><br>");
            out.println("<h2>" + phone + "<h2><br/>");
            out.println("<h2>" + email + "<h2><br/>");
            out.println("</html>");
        }
    }
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws  IOException, ServletException
        {
            doGet(request, response);
        }

    }
