<%@ page import="com.hodangsan.jdbc.DbConnection" %>
<%@ page import="java.sql.Connection" %><%--
  Created by IntelliJ IDEA.
  User: SanArima
  Date: 20-Jun-19
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%
    DbConnection db = new DbConnection();
    Connection conn = db.getConnection();
    if(conn == null){
      out.print("Connection fail!");
    }
    else {
      out.print("Connection success!");
    }
  %>
  </body>
</html>
