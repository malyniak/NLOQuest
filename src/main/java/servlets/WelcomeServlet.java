package servlets;

import services.Answer;
import services.WelcomeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    private WelcomeService service=WelcomeService.getService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String answer = req.getParameter("answer");
        service.checkAnswer(new Answer(answer));
        getServletContext().getRequestDispatcher(service.getNextStep().getUrl()).forward(req, resp);
    }
}
