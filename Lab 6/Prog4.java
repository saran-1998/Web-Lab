import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Prog4 extends HttpServlet {

    private int hitCount;
    private HttpSession session;

    public void init() {
        hitCount = 0;
        session = null;
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

        hitCount++;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        if (session == null) {
            out.println("Welcome Guest");
            session = req.getSession();
        } else {
            out.println("Welcome Back");
        }
    }

}