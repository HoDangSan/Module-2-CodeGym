<%--
  Created by IntelliJ IDEA.
  User: SanArima
  Date: 15-Jul-19
  Time: 8:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert Currency</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<form class="form-inline" method="post" style="margin-left:200px ; margin-top: 50px;">
    <input type="text" class="form-control mb-2 mr-sm-2 w-5" name="usd" id="usd" value="${usd}">
    <label for="usd" class="mr-sm-5">USD</label>

    <input type="text" class="form-control mb-2 mr-sm-2 w-5" id="vnd" value="${vnd}">
    <label for="vnd" class="mr-sm-5">VNĐ</label>

    <button type="submit" class="btn btn-primary mb-2">Convert</button>
</form>
</body>
</html>
