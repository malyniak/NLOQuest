<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="static text.TextContent.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quiz</title>
</head>
<body>
<div>
    <%= LOSE_MEMORY %>
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
