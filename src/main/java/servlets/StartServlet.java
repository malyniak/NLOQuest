package servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

@WebServlet("/start")
public class StartServlet extends HttpServlet {
    Logger logger = LoggerFactory.getLogger(StartServlet.class);
    StartService service = StartService.getService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String answer = request.getParameter("answer");
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