<%@page import="java.sql.*" %>
 
<%
    if(request.getParameter("submit")!=null)
    {
        String id = request.getParameter("id");
        String name = request.getParameter("sname");
        String course = request.getParameter("course");
        String fee = request.getParameter("fee");
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/tution","root","");
        pst = con.prepareStatement("update records set name = ?,course =?,fee= ? where id = ?");
        pst.setString(1, name);
        pst.setString(2, course);
        pst.setString(3, fee);
        pst.setString(4, id);
        pst.executeUpdate();  
        
        %>
        
        <script>  
            alert("Record Updated");          
        </script>
        
    <%            
    response.sendRedirect("index.jsp");
    }
%>
 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <style>
            a{
                text-decoration: none;
            }
            p{
                font-size: 25px;
            }
        </style>
    </head>
    <body>
        <div class="container">
            
        <h1>Student Update</h1>
        
        <div class="row">
            <div class="col-sm-4">
                <form  method="POST" action="#" >
                    
                    <%    
                        Connection con;
                        PreparedStatement pst;
                        ResultSet rs;
        
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://localhost/tution","root","");
                          
                        String id = request.getParameter("id");
                          
                        pst = con.prepareStatement("select * from records where id = ?");
                        pst.setString(1, id);
                        rs = pst.executeQuery();
                        
                        while(rs.next())
                        {
                    
                    %>
                    <div align="left">
                        <label class="form-label">Student Name</label>
                        <input type="text" class="form-control" placeholder="Student Name" value="<%= rs.getString("name")%>" name="sname" id="sname" required >
                    </div>
                        
                    <div align="left">
                        <label class="form-label">Course</label>
                        <select class="form-control" name="course" id="course" required>
                            <option value="<%= rs.getString("course")%>"><%= rs.getString("course")%></option>
                            <option value="Java Programming">Java Programming</option>
                            <option value="Data Science">Data Science</option>
                            <option value="Web-Development">Web-Development</option>
                            <option value="Machine Learning">Machine Learning</option>
                            <option value="Data Mining">Data Mining</option>
                        </select>
                    </div>
                        
                    <div align="left">
                        <label class="form-label">Fee</label>
                        <input type="text" class="form-control" placeholder="Fee" name="fee" id="fee" value="<%= rs.getString("fee")%>" required >
                    </div>
                    
                    <% }  %>

                    </br>
                        
                    <div align="right">
                         <input type="submit" id="submit" value="Submit" name="submit" class="btn btn-info">
                         <input type="reset" id="reset" value="Reset" name="reset" class="btn btn-warning">
                    </div>  
                        
                    <div align="right">
                        <p><a href="index.jsp">Click Here To Go Back</a></p>
                    </div>
  
                </form>
            </div>          
        </div>
        </div>
  
    </body>
</html>