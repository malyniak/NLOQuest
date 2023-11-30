package servlets;

import services.Answer;
import services.LoseService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lose")
public class EndServlet extends HttpServlet {
    LoseService endQuestService=LoseService.getService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String answer = request.getParameter("answer");
        endQuestService.checkAnswer(new Answer(answer));
        String nextUrl = endQuestService.getNextStep().getUrl();
        RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher(nextUrl);
        requestDispatcher.forward(request,response);
    }
}
