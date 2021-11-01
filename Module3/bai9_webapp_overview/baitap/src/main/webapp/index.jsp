<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 29/10/2021
  Time: 12:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/calculate">
    <h1>Product Information</h1>
    <input type="text" name="productName" placeholder="productName"><br>
    <input type="number" name="productPrice" placeholder="productPrice"><br>
    <input type="number" name="discountPercent" placeholder="discountPercent"><br>
    <input type="submit" value="Calculate Discount">
  </form>
  </body>
</html>
