<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="static text.TextContent.WIN" %>
<%@ page import="static text.TextContent.*" %>

<html>
<head>
    <title>Title</title>
    <link href="static/win.css" rel="stylesheet">
</head>
<body>
<div class="restart-container">
<div>
    ${sessionScope.player}
    <%=", " + WIN%>
    ${sessionScope.score}

</div>
<form class="restart-form" action="/restart" method="post">
<button class="ui-button"  type="submit" value="<%=RESTART%>">Start again</button>
    </form>
</div>
</body>
</html>
