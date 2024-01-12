package servlets;

import org.slf4j.*;
import services.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/start")
public class StartServlet extends HttpServlet {
    private final Logger logger = LoggerFactory.getLogger(StartServlet.class);
    private final StartService service = new StartService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String textAnswer = request.getParameter("answer");
        Answer answer = service.checkAnswer(textAnswer);
        if (answer.getResult().equals(Answer.ACCEPT)) {
            request.getServletContext().getRequestDispatcher("/captain.jsp").forward(request, response);
            logger.info("Go to /captain.jsp ");
        } else {
            request.getServletContext().getRequestDispatcher("/lose.jsp").forward(request, response);
            logger.info("Lose quest");
        }


    }
}