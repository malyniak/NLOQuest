package servlets;

import org.slf4j.*;
import playerInfo.Player;
import services.*;
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
        HttpSession session = request.getSession();
        if(service.checkAnswer(new Answer(answer))) {
            Player player =(Player) session.getAttribute("player");
            player.setScore(player.getScore()+1);
            session.removeAttribute("player");
            session.setAttribute("player", player);
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