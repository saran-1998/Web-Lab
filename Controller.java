import java.io.*;
import java.util.Random;

import javax.servlet.*;
import javax.servlet.http.*;

public class Controller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            String name = request.getParameter("name");
            String password = request.getParameter("password");

            LoginBean bean = new LoginBean();
            bean.setName(name);
            bean.setPassword(password);
            request.setAttribute("bean", bean);
            boolean status = bean.validate();

            if (status) {
                RequestDispatcher rd = request.getRequestDispatcher("login-success.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
                rd.forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        doPost(request, response);
    }
}