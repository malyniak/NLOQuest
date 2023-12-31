package servlets;

import services.Answer;
import services.CaptainBridgeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/captain")
public class CaptainBridgeServlet extends HttpServlet {
    CaptainBridgeService captainBridgeService=CaptainBridgeService.getInstance();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String answer = request.getParameter("answer");
        captainBridgeService.checkAnswer(new Answer(answer));
        String url = captainBridgeService.getNextStep().getUrl();
        RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher(url);
        requestDispatcher.forward(request,response);
    }
}
