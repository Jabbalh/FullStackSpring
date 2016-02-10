<%--
  Created by IntelliJ IDEA.
  User: Nico
  Date: 09/02/2016
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Full statck test</title>
</head>
<body>
    Message : ${message}

    <form action="/log" method="get">
        <label>Login</label>
        <input type="text" name="login" />
        <button type="submit" value="ok">OK</button>
    </form>

</body>
</html>
