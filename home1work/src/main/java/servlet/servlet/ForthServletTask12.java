package servlet.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/image")
public class ForthServletTask12 extends HttpServlet {


    private int countHit;

    @Override
    public void init() throws ServletException {
        countHit = 0;
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/jpeg");
        countHit++;
        BufferedImage image = new BufferedImage(500,200, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        graphics.setFont(new Font("La Dolce", Font.CENTER_BASELINE, 23));
        graphics.setColor(Color.PINK);
        graphics.drawString(String.valueOf(countHit),300,150);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpeg", out);

        String cH = Integer.toString(countHit);
        FileWriter writer = new FileWriter("D:\\jd2_homework\\home1work\\src\\main\\webapp\\countHit1.txt");
        writer.write(cH);
        writer.close();
    }

}
