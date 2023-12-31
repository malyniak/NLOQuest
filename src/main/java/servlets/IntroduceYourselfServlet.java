package servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import playerInfo.Player;
import services.Answer;
import services.IntroduceYourselfService;
import services.Service;
import services.WinService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/introduce")
public class IntroduceYourselfServlet extends HttpServlet {
    Logger logger= LoggerFactory.getLogger(IntroduceYourselfServlet.class);
    IntroduceYourselfService service=IntroduceYourselfService.getService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String answer = request.getParameter("answer");
        Service nextService = service.checkAnswer(new Answer(answer));
        HttpSession session = request.getSession();
        Player player =(Player) session.getAttribute("player");
        player.setScore(player.getScore()+1);
        session.removeAttribute("player");
        session.setAttribute("player", player);
        if(nextService== WinService.getService()) {
            RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/win.jsp");
            requestDispatcher.forward(request,response);
            logger.info("Client win");
        }
        else {
            RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/lose.jsp");
            requestDispatcher.forward(request,response);
            logger.info("Client lose");
        }

    }
}