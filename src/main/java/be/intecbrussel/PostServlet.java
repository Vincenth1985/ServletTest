package be.intecbrussel;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(value = "/postservlet")
public class PostServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("Name");
        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        writer.println("<html>");
        writer.println("<head>");

        if (name.isEmpty()) {
            writer.println("<H2>Hello Guest</H2>");
            writer.println(("You reached the POST Servlet"));

        } else {

            writer.println("<H2>Hello " + name + "</H2><br>");
            writer.println(("<H2>You reached the POST Servlet</H2>"));
        }

        writer.println("</head>");
        writer.println("<Body>");
        writer.println("<H3><a href=\"getservlet\">Back to the GetServlet</a></H3><br>");
        writer.println("<form>");
        writer.println("<input type=\"button\" value=\"Back to the GET SERVLET\" onclick=\"location.href='getservlet'\" />");
        writer.println("</form>");
        writer.println("</Body>");

    }
}
