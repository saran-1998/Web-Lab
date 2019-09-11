import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Prog8 extends HttpServlet{

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        try {
            res.setContentType("text/html");
            String email = req.getParameter("userName");
            String pass = req.getParameter("passWord");
            if (email.contains("@")) {
                RequestDispatcher rd = req.getRequestDispatcher("Prog8Success");
                rd.include(req, res);
            } else {
                RequestDispatcher rd = req.getRequestDispatcher("Prog8Error");
                rd.include(req, res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}