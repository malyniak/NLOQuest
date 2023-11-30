<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="static text.TextContent.WHO_ARE_YOU" %>
<%@ page import="static text.TextContent.SAY_TRUTH" %>
<%@ page import="static text.TextContent.*" %>
<html>
<head>
    <title>Quiz</title>
</head>
<body>
<div><%=WHO_ARE_YOU%></div>
<form method="post" action="/introduce">
    <label>
        <input type="radio" name="answer" value="truth"><%=SAY_TRUTH%>
    </label>
    <br>
    <label>
        <input type="radio" name="answer" value="lie"><%=LIE%>
    </label>
    <br>
    <button type="submit"><%=SEND%>></button>
</form>
</body>
</html>
