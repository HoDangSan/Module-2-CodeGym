<%--
  Created by IntelliJ IDEA.
  User: SanArima
  Date: 15-Jun-19
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>
<div id="content">
    <h1 id="title">Product Discount Calculator</h1>
    <form method="post" action="/display_discount">
        <div id="data">
            <label id="lbprodes">Product Description:</label>
            <input type="text" name="description"><br>
            <label id="lblispri">List Price:</label>
            <input type="text" name="price"><br>
            <label id="lbdisper">Discount Percent:</label>
            <input type="text" name="discount_percent">&nbsp;(%)<br>
        </div>
        <div id="buttons">
            <label>&nbsp;</label>
            <input type="submit" class="btn btn-success" value="Calculate Discount">
        </div>
    </form>
</div>
</body>
</html>