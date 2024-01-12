package servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import services.Answer;
import services.IntroduceYourselfService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

import static services.Answer.ACCEPT;

@WebServlet("/introduce")
public class IntroduceYourselfServlet extends HttpServlet {
   private final Logger logger = LoggerFactory.getLogger(IntroduceYourselfServlet.class);
   private final IntroduceYourselfService service = new IntroduceYourselfService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String textAnswer = request.getParameter("answer");
        Answer answer = service.checkAnswer(textAnswer);
        HttpSession session = request.getSession();
       if(answer.getResult().equals(ACCEPT)) {
            int score =(int) session.getAttribute("score");
            session.setAttribute("score", score + 1);
            request.getServletContext().getRequestDispatcher("/win.jsp").forward(request,response);
            logger.info("Client win");
        }
        else {
            RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/lose.jsp");
            requestDispatcher.forward(request,response);
            logger.info("Client lose");
        }
            }
}