import java.io.*;
import java.util.Random;

import javax.servlet.*;
import javax.servlet.http.*;

public class Prog3a extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Form Display</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("Name: " + req.getParameter("name"));
        out.println("Registration number: " + req.getParameter("reg_no"));
        out.println("Email_id: " + req.getParameter("email"));
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}