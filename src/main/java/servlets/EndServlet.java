package servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getServletContext().getRequestDispatcher("/start.jsp");
        requestDispatcher.forward(request,response);
        logger.debug("Restart quest after lose");
    }
}
