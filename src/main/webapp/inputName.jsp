
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="static/input.css" rel="stylesheet">
</head>
<body>
<h2 class="welcome">Стартова сторінка</h2>
<div class="form-wrapper">
<form  action="/input" method="post">
    <label for="player">Введіть ваше ім'я:</label>
    <input class="input-text" type="text" id="player" name="player" required>
    <br>
    <input class="ui-button" type="submit" value="Відправити">
</form>
</div>
</body>
</html>
