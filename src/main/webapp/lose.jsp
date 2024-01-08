<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link href="static/lose.css" rel="stylesheet">
</head>
<body>
<div class="restart-container">
    <div>
        ${sessionScope.player}, поразка. Кількість перемог -
        ${sessionScope.player.score}
    </div>
    <button class="ui-button" type="button" onclick="restart()" value="Розпочати заново">Restart</button>
    <script>
        function restart() {
            window.location.href = "/start.jsp";
        }
    </script>
</div>
</body>
</html>
