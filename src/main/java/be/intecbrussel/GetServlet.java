package be.intecbrussel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/getservlet")
public class GetServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter respWriter = resp.getWriter();

        respWriter.println("<html>");
        respWriter.println("<head>");
        respWriter.println("</head>");
        respWriter.println("<body>");
        respWriter.println("<h1>Welcome, enter name please.</h1>");
        respWriter.println("<form method=\"post\"action=\"postservlet\">");
        respWriter.println("<input type=\"text\" name=\"Name\">");
        respWriter.println("<input type=\"submit\">");
        respWriter.println("</form>");
        respWriter.println("</body>");
        respWriter.println("</html>");

    }
}
