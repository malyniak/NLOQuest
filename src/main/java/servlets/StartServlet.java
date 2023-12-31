package servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import playerInfo.Player;
import services.Answer;
import services.CaptainBridgeService;
import services.Service;
import services.StartService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/start")
public class StartServlet extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(StartServlet.class);
    StartService service = StartService.getService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String answer = request.getParameter("answer");
        int score = Integer.parseInt(Optional.ofNullable(request.getSession().getAttribute("score")).orElse(0).toString());
        String playerName=request.getSession().getAttribute("player").toString();
        Player player = new Player(playerName, score);
        request.getSession().setAttribute("player", player);
        Service nextService = service.checkAnswer(new Answer(answer));
        if(nextService== CaptainBridgeService.getService()) {
            RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/captain.jsp");
            requestDispatcher.forward(request, response);
            logger.info("Go the " + nextService.getUrl());
        }
        else {
            RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/lose.jsp");
            requestDispatcher.forward(request, response);
            logger.info("Lose quest");
        }



    }
}