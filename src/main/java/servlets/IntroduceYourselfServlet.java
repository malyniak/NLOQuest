package servlets;

import services.Answer;
import services.IntroduceYourselfService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/introduce")
public class IntroduceYourselfServlet extends HttpServlet {
    IntroduceYourselfService service=IntroduceYourselfService.getInstance();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String answer = request.getParameter("answer");
        service.checkAnswer(new Answer(answer));
        String nextUrl = service.getNextStep().getUrl();
        RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher(nextUrl);
        requestDispatcher.forward(request,response);
    }
}