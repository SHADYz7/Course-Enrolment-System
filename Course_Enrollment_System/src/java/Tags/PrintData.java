package Tags;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class PrintData extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/tution";
            String username = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, username, password);
            String q = "select * from records";
            PreparedStatement pst = conn.prepareStatement(q);
            ResultSet rs = pst.executeQuery();


            /* Printing column names */
            int total = 0;
            /* Printing result */
            while (rs.next()) {
                total++;
            }
            out.println("<h2>Total Number Records : " + total + "</h2>");
        } catch (Exception e) {
            System.out.println(e);
        }
        return SKIP_BODY;
    }

}
