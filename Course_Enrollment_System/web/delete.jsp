<%@page import="java.sql.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="id" value="${param.id}"/>

<sql:setDataSource var="conn" driver="com.mysql.jdbc.Driver"  url="jdbc:mysql://localhost/tution"  user="root"  password=""/>
<sql:update dataSource="${conn}" var="count">  
                DELETE FROM records WHERE id = ? 
            <sql:param value="${id}" /> 
</sql:update>

        
<script>
    alert("Record Delete");
</script>
<%
        response.sendRedirect("index.jsp");
%>