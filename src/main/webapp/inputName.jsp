<%--
  Created by IntelliJ IDEA.
  User: Вова
  Date: 30.11.2023
  Time: 10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/input" method="post">
    <label for="player">Введіть ваше ім'я:</label>
    <input type="text" id="player" name="player" required>
    <br>
    <input type="submit" value="Відправити">
</form>
</body>
</html>
