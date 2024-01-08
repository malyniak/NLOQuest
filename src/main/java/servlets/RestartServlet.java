package servlets;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/restart")
public class RestartServlet extends HttpServlet {
    Logger logger= LoggerFactory.getLogger(IntroduceYourselfServlet.class);
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/start.jsp");
        logger.debug("Client start again quest");
    }
}
