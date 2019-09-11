import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class Prog3b {
    public static void main(String args[]) {
        // res.setContentType("text/html");
        // PrintWriter out = res.getWriter();

        try {
            Class.forName("jdbc.com.mysql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/weblab", "root", "susan6298");
            Statement st = conn.createStatement();
            String sql = "INSERT INTO reg_details values (?,?,?)";
            PreparedStatement pr = conn.prepareStatement(sql);

            pr.setString(1, "Madhu");
            pr.setInt(2, 2016503021);
            pr.setString(3, "madhu@gmail.com");

            // pr.setString(1, req.getParameter("name"));
            // pr.setInt(2, Integer.parseInt(req.getParameter("reg_no")));
            // pr.setString(3, req.getParameter("email"));
            pr.execute();

            sql = "SELECT * from reg_details";
            ResultSet rs = st.executeQuery(sql);

            // out.println("<html>");
            // out.println("<head>");
            // out.println("<title>Form Display</title>");
            // out.println("</head>");
            // out.println("<body>");

            int cnt = 1;
            while (rs.next()) {
                String name = rs.getString("name");
                int reg_no = rs.getInt("reg_no");
                String email = rs.getString("email");

                System.out.println("RECORD" + cnt);
                System.out.println("Name: " + name);
                System.out.println("Registration number: " + reg_no);
                System.out.println("Email_id: " + email);
                // out.println("<br />");
                // out.println("<br />");
                cnt++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // out.println("</body>");
        // out.println("</html>");
        // out.close();
    }
}