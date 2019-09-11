import java.io.*;
import java.util.Random;

import javax.servlet.*;
import javax.servlet.http.*;

public class Prog1 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        Random rand = new Random();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Random numbers</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<ol>");
        out.println("<li>" + Integer.toString(rand.nextInt(100) + 1) + "</li>");
        out.println("<li>" + Integer.toString(rand.nextInt(100) + 1) + "</li>");
        out.println("<li>" + Integer.toString(rand.nextInt(100) + 1) + "</li>");
        out.println("<li>" + Integer.toString(rand.nextInt(100) + 1) + "</li>");
        out.println("</ol>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}