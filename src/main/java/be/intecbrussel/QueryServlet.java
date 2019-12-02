package be.intecbrussel;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/QueryServlet")
public class QueryServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/plain");

        String param = "param";
        String paramValue = req.getParameter(param);

        if (paramValue == null) {
            out.write("Hello Pluto");
        } else {

            out.write(paramValue);
        }
        out.close();
    }
}
