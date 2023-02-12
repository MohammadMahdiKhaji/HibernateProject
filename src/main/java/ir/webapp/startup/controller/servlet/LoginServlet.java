package ir.webapp.startup.controller.servlet;

import ir.webapp.startup.controller.app.TokenController;
import ir.webapp.startup.controller.app.UserAccessController;
import ir.webapp.startup.controller.session.SessionManager;
import ir.webapp.startup.model.entity.Token;
import ir.webapp.startup.model.entity.UserAccess;
import ir.webapp.startup.model.entity.enumeration.Classification;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Date;

@WebServlet(urlPatterns = {"/login", "/login/*"}, name = "loginServlet")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (UserAccessController.getUserAccessController().login(req.getParameter("username"), req.getParameter("password"))){
            if (UserAccessController.getUserAccessController().checkClassification(req.getParameter("username"), req.getParameter("password"))) {
//                resp.setHeader("token", TokenController.getTokenController().save(req.getParameter("username"), req.getParameter("password")).getToken());
                HttpSession session = req.getSession();
                session.setAttribute("token", TokenController.getTokenController().save(req.getParameter("username"), req.getParameter("password")).getToken());
                session.setAttribute("role", Classification.Manager);
                doGet(req, resp);
            }else {
                doGet(req, resp);
            }
        }else {
            resp.sendRedirect("login.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SessionManager.addHttpSession(req.getSession());
        req.getRequestDispatcher("panel").forward(req, resp);
    }
}
