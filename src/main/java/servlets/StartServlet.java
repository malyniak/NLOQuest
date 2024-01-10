package servlets;

import org.slf4j.*;
import services.*;
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
        if(service.checkAnswer(new Answer(answer))) {
            RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/captain.jsp");
            requestDispatcher.forward(request, response);
            logger.info("Go to /captain.jsp ");
        }
        else {
            RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/lose.jsp");
            requestDispatcher.forward(request, response);
            logger.info("Lose quest");
        }



    }
}