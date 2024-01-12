<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quiz</title>
    <link href="static/introduce.css" rel="stylesheet">
</head>
<body>
<div class="form-wrapper">
<div class="question">
    ${sessionScope.player}, Ви піднялися на місток. Хто ви?
</div>
<form class="click_form" method="post" action="/introduce">
    <label>
        <input type="radio" name="answer" value="accept">Розповісти правду про себе
    </label>
    <br>
    <label>
        <input type="radio" name="answer" value="reject">Збрехати
    </label>
    <br>
    <button class="ui-button" type="submit">Відправити відповідь</button>
</form>
</div>
</body>
</html>
