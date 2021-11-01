<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 28/10/2021
  Time: 10:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        h2{
            color: red;
        }
        .login{
            text-align: center;
            justify-content: center;
            align-content: center;
        }
    </style>
</head>
<body>
    <form method="get" action="/login">
        <div class="login">
            <h2>Login</h2>
            <input type="text" name="user" placeholder="Username" size="30"/><br>
            <input type="password" name="password" placeholder="password" size="30"/><br>
            <input type="submit" value="Sign in"/>
        </div>
    </form>
</body>
</html>
