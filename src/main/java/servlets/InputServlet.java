package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/input")
public class InputServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        int score = Integer.parseInt(Optional.ofNullable(session.getAttribute("score")).orElse(0).toString());
        session.setAttribute("score", score);
        String playerName=req.getParameter("player");
        session.setAttribute("player", playerName);
        req.getServletContext().getRequestDispatcher("/start.jsp").forward(req,resp);
    }
}
