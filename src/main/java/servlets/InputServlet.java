package servlets;

import services.InputNameService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/input")
public class InputServlet extends HttpServlet {
    private InputNameService service=InputNameService.getService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("player");
        HttpSession session = req.getSession();
        session.setAttribute("player", username);
        req.getServletContext().getRequestDispatcher(service.getNextStep().getUrl()).forward(req,resp);
    }
}
