<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>panel</title>
</head>
<body>
<div>
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
</div>
<div>
<%--<c:if test="${sessionScope.role}" >--%>
<%--    <c:when test="Manager">--%>
        <div>
            <form action="/message" method="get">
                <input type="text" name="message">
                <input type="submit">
            </form>
        </div>
<%--    </c:when>--%>
<%--    <c:otherwise>--%>
        <div>
            <button onclick="message()">Get Messages</button>
            <input type="text" id="message">
        </div>
<%--    </c:otherwise>--%>
<%--</c:if>--%>
</div>
</body>
<script >

    var webSocket = new WebSocket("ws://localhost:80/messagendpoint")

    webSocket.onopen = function (message) {
        console.log("Open")
    };
    webSocket.onclose = function (message) {
        console.log("Close")
    };
    webSocket.onmessage = function (message) {
        console.log("Message");
        document.getElementById("message").innerHTML = message.data;
    };
    webSocket.onerror = function (message) {
        console.log("Error")
    };

</script>
</html>
