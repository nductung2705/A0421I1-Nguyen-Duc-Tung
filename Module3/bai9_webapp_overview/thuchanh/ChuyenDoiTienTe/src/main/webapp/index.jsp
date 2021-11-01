<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 28/10/2021
  Time: 11:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Currency Converter</title>
  </head>
  <body>
  <form method="get" action="/convert">
    <h1>Currency Converter</h1>
    <input type="number" name="rate" placeholder="rate">
    <br>
    <input type="number" name="usd" placeholder="USD">
    <br>
    <input type="submit" value="Convert">
    <br>

  </form>
  </body>
</html>
