<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="static text.TextContent.WIN" %>
<%@ page import="static text.TextContent.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div><%=WIN%>
</div>
<form action="/restart" method="post">
<button  type="submit" value="<%=RESTART%>">Start again</button>
    </form>
</body>
</html>
