package servlets;

import playerInfo.Player;
import services.InputNameService;

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
    private InputNameService service=InputNameService.getService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        int score = Integer.parseInt(Optional.ofNullable(session.getAttribute("score")).orElse(0).toString());
        String playerName=req.getParameter("player");
        Player player = new Player(playerName, score);
        session.setAttribute("player", player);
        req.getServletContext().getRequestDispatcher("/start.jsp").forward(req,resp);
    }
}
