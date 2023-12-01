
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="static text.TextContent.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Quiz</title>
</head>
<body>
<div>
    <c:if test="${not empty sessionScope.player}">
        <p>Ласкаво просимо, <c:out value="${sessionScope.player}" />!</p>
    </c:if>
   <%=LOSE_MEMORY %>
</div>


<form method="post" action="/start">
    <label>
        <input type="radio" name="answer" value="accept">
        <%=ACCEPT%>
    </label>
    <br>
    <label>
        <input type="radio" name="answer" value="reject"> <%=REJECT%>
    </label>
    <br>
    <button type="submit"><%=SEND%>
    </button>
</form>
</body>
</html>
