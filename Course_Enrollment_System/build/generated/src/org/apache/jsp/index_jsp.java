package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tlds/taglib.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_t_print_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_t_print_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_t_print_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

 
    if(request.getParameter("submit")!=null)
    {
        String name = request.getParameter("sname");
        String course = request.getParameter("course");
        String fee = request.getParameter("fee");
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/tution","root","");
        pst = con.prepareStatement("insert into records(name,course,fee)values(?,?,?)");
        pst.setString(1, name);
        pst.setString(2, course);
        pst.setString(3, fee);
        pst.executeUpdate();  
        
        
      out.write("\n");
      out.write("    <script>  \n");
      out.write("        alert(\"Record Added\");    \n");
      out.write("    </script>\n");
      out.write("    ");
            
    }
 
      out.write("\n");
      out.write(" \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <h1>Course Enrollment System</h1>\n");
      out.write("        </br>\n");
      out.write("        <div class=\"row pd-4\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <form  method=\"POST\" action=\"#\" >\n");
      out.write("                    \n");
      out.write("                    <div align=\"left\">\n");
      out.write("                        <label class=\"form-label\">Student Name</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Student Name\" name=\"sname\" id=\"sname\" required >\n");
      out.write("                     </div>\n");
      out.write("                        \n");
      out.write("                    <div align=\"left\">\n");
      out.write("                        <label class=\"form-label\">Course</label>\n");
      out.write("                        <select class=\"form-control\" name=\"course\" id=\"course\" required>\n");
      out.write("                            <option value=\"\" selected=\"false\"></option>\n");
      out.write("                            <option value=\"Java Programming\">Java Programming</option>\n");
      out.write("                            <option value=\"Data Science\">Data Science</option>\n");
      out.write("                            <option value=\"Web-Development\">Web-Development</option>\n");
      out.write("                            <option value=\"Machine Learning\">Machine Learning</option>\n");
      out.write("                            <option value=\"Data Mining\">Data Mining</option>\n");
      out.write("                        </select>\n");
      out.write("                     </div>\n");
      out.write("                        \n");
      out.write("                     <div align=\"left\">\n");
      out.write("                        <label class=\"form-label\">Fee</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Fee\" name=\"fee\" id=\"fee\" required >\n");
      out.write("                     </div>\n");
      out.write("                         </br>\n");
      out.write("                        \n");
      out.write("                     <div align=\"right\">\n");
      out.write("                         <input type=\"submit\" id=\"submit\" value=\"Submit\" name=\"submit\" class=\"btn btn-info\">\n");
      out.write("                         <input type=\"reset\" id=\"reset\" value=\"Reset\" name=\"reset\" class=\"btn btn-warning\">\n");
      out.write("                     </div>  \n");
      out.write("                        \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             <div class=\"col-sm-8\">\n");
      out.write("                 ");
      if (_jspx_meth_t_print_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                 <div class=\"panel-body\">\n");
      out.write("                     <table id=\"tbl-student\" class=\"table table-responsive table-bordered\" cellpadding =\"0\" width=\"100%\">\n");
      out.write("                         <thead>\n");
      out.write("                             <tr>\n");
      out.write("                                    <th>Student Name</th>\n");
      out.write("                                    <th>Course</th>\n");
      out.write("                                    <th>Fee</th>\n");
      out.write("                                    <th>Edit</th>\n");
      out.write("                                    <th>Delete</th>\n");
      out.write("                             </tr>  \n");
      out.write("                            \n");
      out.write("                             ");
  
 
                                Connection con;
                                PreparedStatement pst;
                                ResultSet rs;
        
                                Class.forName("com.mysql.cj.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost/tution","root","");
                                
                                  String query = "select * from records";
                                  Statement st = con.createStatement();
                                  
                                    rs =  st.executeQuery(query);
                                    
                                        while(rs.next())
                                        {
                                            String id = rs.getString("id");
                                   
      out.write("\n");
      out.write("            \n");
      out.write("                             <tr>\n");
      out.write("                                 <td>");
      out.print(rs.getString("name") );
      out.write("</td>\n");
      out.write("                                 <td>");
      out.print(rs.getString("course") );
      out.write("</td>\n");
      out.write("                                 <td>");
      out.print(rs.getString("fee") );
      out.write("</td>\n");
      out.write("                                 <td><a href=\"update.jsp?id=");
      out.print(id);
      out.write("\">Edit</a></td>\n");
      out.write("                                 <td><a href=\"delete.jsp?id=");
      out.print(id);
      out.write("\">Delete</a></td>\n");
      out.write("                             </tr>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                                ");

                                
                                 }
                               
      out.write("\n");
      out.write("                            \n");
      out.write("                     </table>    \n");
      out.write("                 </div>\n");
      out.write(" \n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_print_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:print
    Tags.PrintData _jspx_th_t_print_0 = (Tags.PrintData) _jspx_tagPool_t_print_nobody.get(Tags.PrintData.class);
    _jspx_th_t_print_0.setPageContext(_jspx_page_context);
    _jspx_th_t_print_0.setParent(null);
    int _jspx_eval_t_print_0 = _jspx_th_t_print_0.doStartTag();
    if (_jspx_th_t_print_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_t_print_nobody.reuse(_jspx_th_t_print_0);
      return true;
    }
    _jspx_tagPool_t_print_nobody.reuse(_jspx_th_t_print_0);
    return false;
  }
}
