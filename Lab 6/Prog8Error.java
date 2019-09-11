import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Prog8Error extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("The e-mail id is invalid.");
        out.println("To retry click the link below");
        out.println("<a href='/Prog8.html'>Login Page</a>");
    }
}