<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 01/11/2021
  Time: 12:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="bootstrap.css">
    <style>
        table{
            height: 100%;
            width: 100%;
        }
        tr,td{
            border: darkblue solid 1px;
            height: 10em;
            width: 20em;
        }
        .img{
            height: 100%;
            width: 100%;
        }
        th{
            font-size: 150%;
            border: darkblue solid 1px;
        }

    </style>
</head>
<body>
    <table class="table border-dark">
        <tr>
            <th colspan="5">Danh sach khach hang</th>
        </tr>
        <tr>
            <th>Ten</th>
            <th>Ngay sinh</th>
            <th>Dia chi</th>
            <th>Anh</th>
        </tr>
        <c:forEach items="${list}" var="customer">
            <tr>
                <td><p>${customer.name}</p></td>
                <td>${customer.birthday}</td>
                <td>${customer.address}</td>
                <td><img class="img" src="${customer.image}"></td>
            </tr>
        </c:forEach>
    </table>
    <script type="text/javascript" src="bootstrap.js"></script>
</body>
</html>
