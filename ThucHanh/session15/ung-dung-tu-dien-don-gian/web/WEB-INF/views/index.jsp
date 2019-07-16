<%--
  Created by IntelliJ IDEA.
  User: SanArima
  Date: 15-Jul-19
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Từ điển Anh-Việt</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<form action="/convert" method="post">
    <div class="container mb-2">
        <div class="row">
            <div class="col-md-4">
                <div class="form-group">
                    <lable for="en">Tiếng Anh:</lable>
                    <textarea name="en" id="en" rows="4" cols="30">${en}</textarea>
                </div>
            </div>
            <div class="col-md-4">
                <div class="form-group">
                    <lable for="vi">Tiếng Việt:</lable>
                    <textarea name="vi" id="vi" rows="4" cols="30">${vi}</textarea>
                </div>
            </div>
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Dịch</button>
</form>
</body>
</html>
