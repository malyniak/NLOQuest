package servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    Logger logger= LoggerFactory.getLogger(EndServlet.class);
    LoseService loseService=LoseService.getService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nextUrl = loseService.getNextStep().getUrl();
        RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher(nextUrl);
        requestDispatcher.forward(request,response);
        logger.debug("Restart quest after lose");
    }
}
