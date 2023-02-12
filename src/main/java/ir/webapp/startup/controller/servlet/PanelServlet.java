package ir.webapp.startup.controller.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(urlPatterns = "/panel", name = "panel")
public class PanelServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post");
        System.out.println("Get : "+req.getRemoteAddr());
        System.out.println("Get : "+req.getSession().getId());
        req.getRequestDispatcher("panel.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get");
        System.out.println("Get : "+req.getRemoteAddr());
        System.out.println("Get : "+req.getSession().getId());
        req.getRequestDispatcher("panel.jsp").forward(req, resp);
    }
}
