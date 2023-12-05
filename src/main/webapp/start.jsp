
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="static text.TextContent.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quiz</title>
    <link href="static/start.css" rel="stylesheet">
</head>
<body>
<h2 class="welcome">
    <c:if test="${not empty sessionScope.player}">
     <%=WELCOME%> <c:out value="${sessionScope.player} " escapeXml="false"/>!
    </c:if>
</h2>
<div class="form-wrapper">
<div class="question" ><%=LOSE_MEMORY %></div>

<form class="click_form" method="post" action="/start">
    <label>
        <input class="option1" type="radio" name="answer" value="accept">
        <%=ACCEPT%>
    </label>
    <br>
    <label>
        <input class="option1" type="radio" name="answer" value="reject"> <%=REJECT%>
    </label>
    <br>
    <button class="ui-button" type="submit"><%=SEND%>
    </button>
</form>
</div>
</body>
</html>
