<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Quiz</title>
    <link href="static/captain.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
</head>
<body>
<div class="form-wrapper">
<div class="question">
   ${sessionScope.player}, Ви прийняли виклик. Піднятися на капітанський місток?
</div>
<form class="click_form" method="post" action="/captain">
    <label>
        <input class="option" type="radio" name="answer" value="accept_up">"Піднятися на місток"
    </label>
    <br>
    <label>
        <input class="option" type="radio" name="answer" value="reject_up">Відмовитися підніматися на місток"
    </label>
    <br>
    <button class="ui-button" type="submit">Відправити відповідь
    </button>
</form>
    </div>
</body>
</html>
