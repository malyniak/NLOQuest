<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="static text.TextContent.ACCEPT_UP" %>
<%@ page import="static text.TextContent.UP_ON_BRIDGE" %>
<%@ page import="static text.TextContent.*" %>
<html>
<head>
    <title>Quiz</title>
</head>
<body>
<div><%=UP_ON_BRIDGE%>
</div>
<form method="post" action="/captain">
    <label>
        <input type="radio" name="answer" value="accept"> <%=ACCEPT_UP%>
    </label>
    <br>
    <label>
        <input type="radio" name="answer" value="reject"> <%=REJECT_UP%>
    </label>
    <br>
    <button type="submit"><%=SEND%>
    </button>
</form>
</body>
</html>
