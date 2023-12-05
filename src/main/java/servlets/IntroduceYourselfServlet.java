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

@WebServlet("/introduce")
public class IntroduceYourselfServlet extends HttpServlet {
    Logger logger= LoggerFactory.getLogger(IntroduceYourselfServlet.class);
    IntroduceYourselfService service=IntroduceYourselfService.getService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String answer = request.getParameter("answer");
        service.checkAnswer(new Answer(answer));
        int score = service.getScore();
        HttpSession session = request.getSession();
        session.setAttribute("score",  (int) session.getAttribute("score")+1);
        String nextUrl = service.getNextStep().getUrl();
        RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher(nextUrl);
        requestDispatcher.forward(request,response);
        logger.info("Client go to "+nextUrl);
    }
}