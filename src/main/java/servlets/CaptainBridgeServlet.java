package servlets;

import org.slf4j.*;
import services.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import static services.Answer.ACCEPT;

@WebServlet("/captain")
public class CaptainBridgeServlet extends HttpServlet {
    private final Logger logger = LoggerFactory.getLogger(CaptainBridgeServlet.class);
    private final CaptainBridgeService service = new CaptainBridgeService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String textAnswer = request.getParameter("answer");
        Answer answer = service.checkAnswer(textAnswer);
        if (answer.getResult().equals(ACCEPT)) {
            request.getServletContext().getRequestDispatcher("/introduce.jsp").forward(request, response);
            logger.info("Go the /introduce.jsp");
        } else {
            request.getServletContext().getRequestDispatcher("/lose.jsp").forward(request, response);
            logger.info("Lose quest");
        }
    }
}
