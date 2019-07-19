<%--
  Created by IntelliJ IDEA.
  User: SanArima
  Date: 17-Jul-19
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bill Detail</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<p>
    <c:forEach items='${listFavorite}' var="favorite">
        <div>${favorite}</div>
        <br>
    </c:forEach>
</p>
</body>
</html>
