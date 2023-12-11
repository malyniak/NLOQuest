<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="static text.TextContent.ACCEPT_UP" %>
<%@ page import="static text.TextContent.UP_ON_BRIDGE" %>
<%@ page import="static text.TextContent.*" %>
<html>
<head>
    <title>Quiz</title>
    <link href="static/captain.css" rel="stylesheet">
    <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
</head>
<body>
<div class="form-wrapper">
<div class="question">
   ${sessionScope.player}
    <%=", " + UP_ON_BRIDGE%>
</div>
<form class="click_form" method="post" action="/captain">
    <label>
        <input class="option" type="radio" name="answer" value="accept_up"> <%=ACCEPT_UP%>
    </label>
    <br>
    <label>
        <input class="option" type="radio" name="answer" value="reject_up"> <%=REJECT_UP%>
    </label>
    <br>
    <button class="ui-button" type="submit"><%=SEND%>
    </button>
</form>
    </div>
</body>
</html>
