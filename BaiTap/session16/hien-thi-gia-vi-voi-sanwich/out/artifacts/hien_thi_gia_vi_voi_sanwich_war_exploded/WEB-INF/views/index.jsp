<%--
  Created by IntelliJ IDEA.
  User: SanArima
  Date: 17-Jul-19
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<form action="/detail" method="post">
    <div class="form-check">
        <label class="form-check-label">
            <input type="checkbox" class="form-check-input" name="favorite" value="Lettuce">Lettuce
        </label>
    </div>
    <div class="form-check">
        <label class="form-check-label">
            <input type="checkbox" class="form-check-input" name="favorite" value="Tomato">Tomato
        </label>
    </div>
    <div class="form-check">
        <label class="form-check-label">
            <input type="checkbox" class="form-check-input" name="favorite" value="Mustard">Mustard
        </label>
    </div>
    <div class="form-check">
        <label class="form-check-label">
            <input type="checkbox" class="form-check-input" name="favorite" value="Sprouts">Sprouts
        </label>
    </div>
    <button type="submit" class="btn btn-sm-primary">Ok</button>
</form>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</html>
