import java.io.*;
import java.util.Random;

import javax.servlet.*;
import javax.servlet.http.*;

public class Prog7 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        Random rand = new Random();

        String email = req.getParameter("email");

        if (email.indexOf("@") >= 0) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Success page</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Success</h1>");
            out.println("</body>");
            out.println("</html>");
        } else {
            res.sendError(404, "Bad Request");
        }
        out.close();
    }
}