import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Prog2 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Servlet 2 </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<table border='1'>");
        for (int i = 1; i < 26; i++) {
            out.println("<tr>");
            for (int j = 1; j < 4; j++) {
                out.println("<td>");
                out.println("Row " + i + " Column " + j);
                out.println("</td>");
            }
            out.println("</tr>");
        }
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

}