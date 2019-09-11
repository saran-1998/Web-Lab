import java.io.*;
import java.util.Random;

import javax.servlet.*;
import javax.servlet.http.*;

public class Prog5 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        Cookie name = null, reg_no = null, email = null;
        Cookie[] cookies = null;

        cookies = req.getCookies();

        try {
            if (cookies != null) {
                for (int i = 0; i < cookies.length; i++) {
                    if (cookies[i].getName().equals("Name"))
                        name = cookies[i];
                    if (cookies[i].getName().equals("Reg_No"))
                        reg_no = cookies[i];
                    if (cookies[i].getName().equals("Email"))
                        email = cookies[i];
                }

                if (req.getParameter("name").length() == 0)
                    out.println("Name: " + name.getValue());
                else {
                    out.println("Name: " + req.getParameter("name"));
                    if (name.getValue().equals("Unknown")) {
                        name.setValue(req.getParameter("name"));
                        res.addCookie(name);
                    }
                }

                if (req.getParameter("reg_no").length() == 0)
                    out.println("Registration Number: " + reg_no.getValue());
                else {
                    out.println("Registration Number: " + req.getParameter("reg_no"));
                    if (reg_no.getValue().equals("Unknown")) {
                        reg_no.setValue(req.getParameter("reg_no"));
                        res.addCookie(reg_no);
                    }

                }
                if (req.getParameter("email").length() == 0)
                    out.println("Email: " + email.getValue());
                else {
                    out.println("Email: " + req.getParameter("email"));
                    if (email.getValue().equals("Unknown")) {
                        email.setValue(req.getParameter("email"));
                        res.addCookie(email);
                    }
                }

            }

            else {
                if (req.getParameter("name").length() == 0)
                    name = new Cookie("Name", "Unknown");
                else
                    name = new Cookie("Name", req.getParameter("name"));
                out.println("Name: " + name.getValue());

                if (req.getParameter("reg_no").length() == 0)
                    reg_no = new Cookie("Reg_No", "Unknown");
                else
                    reg_no = new Cookie("Reg_No", req.getParameter("reg_no"));
                out.println("Registration Number: " + reg_no.getValue());

                if (req.getParameter("email").length() == 0)
                    email = new Cookie("Email", "Unknown");
                else
                    email = new Cookie("Email", req.getParameter("email"));
                out.println("Email: " + email.getValue());

                name.setMaxAge(60 * 60 * 24);
                reg_no.setMaxAge(60 * 60 * 24);
                email.setMaxAge(60 * 60 * 24);

                res.addCookie(name);
                res.addCookie(reg_no);
                res.addCookie(email);
            }

            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}