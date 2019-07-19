<%--
  Created by IntelliJ IDEA.
  User: SanArima
  Date: 17-Jul-19
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<form class="form-inline" action="/home" method="post">
    <input type="number" class="form-control" name="number1">
    <input type="number" class="form-control" name="number2"> <br> <br>
    <button type="submit" class="btn btn-primary" name="add">addition(+)</button>
    <button type="submit" class="btn btn-primary" name="sub">Subtraction(-)</button>
    <button type="submit" class="btn btn-primary" name="mul">Multiplication(x)</button>
    <button type="submit" class="btn btn-primary" name="div">Division(/)</button>
</form>
<h2>Result: ${result}</h2>
</body>
</html>
