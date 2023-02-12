<%--
  Created by IntelliJ IDEA.
  User: Sina
  Date: 1/9/2023
  Time: 6:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>panel</title>
</head>
<body>
    <table>
        <thead>
        <tr>
            <td>tokenSession</td>
            <td>role</td>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>${sessionScope.token}</td>
            <td>${sessionScope.role}</td>
        </tr>
        </tbody>
    </table>
</body>
</html>
