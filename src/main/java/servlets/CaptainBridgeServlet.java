package servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import services.Answer;
import services.CaptainBridgeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Optional;

@WebServlet("/captain")
public class CaptainBridgeServlet extends HttpServlet {
    Logger logger= LoggerFactory.getLogger(CaptainBridgeServlet.class);
    CaptainBridgeService captainBridgeService=CaptainBridgeService.getService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String answer = request.getParameter("answer");
        if(Optional.ofNullable(answer).orElse("empty").equals("empty")) {
            getServletContext().getRequestDispatcher("/warning.jsp").forward(request, response);
        }
        else {
            captainBridgeService.checkAnswer(new Answer(answer));
            String url = captainBridgeService.getNextStep().getUrl();
            RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher(url);
            requestDispatcher.forward(request, response);
            logger.info("Go the " + url);
        }
    }
}
