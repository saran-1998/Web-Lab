import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Prog6 extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{

        res.setContentType("text/html");
        String userAgent = req.getHeader("user-agent");
        PrintWriter out = res.getWriter();
        String htmlHeader = "<html> <head> <title> Servlet 6 </title> </head>";
        out.println(htmlHeader);
        String htmlFooter = "</font> </body> </html>";
        if (userAgent.contains("Chrome")){
            out.println("<body bgcolor='red' text='yellow'>");
        }
        else{
            out.println("<body bgcolor='yellow' text='red'>");
        }
        out.println("<table align=center border=1 > <tr> <th> Header </th> <th> Value </th> </tr>");
        Enumeration e = req.getHeaderNames();
        while(e.hasMoreElements()){
            String header = (String)e.nextElement();
            if(header != null ){
                out.println("<tr>");
                out.println("<td> " + header + "</td>");
                out.println("<td> " + req.getHeader(header) + "</td>" );
                out.println("</td>");
            }
        }
        out.println("</table>");
        out.println(htmlFooter);
    }

}