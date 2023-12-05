<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="static text.TextContent.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    ${sessionScope.player}
    <%=", " + END%>
    ${sessionScope.score}
</div>
<button type="button" onclick="restart()" value="<%=RESTART%>">Restart</button>
<script>
    function restart() {
        window.location.href = "/start.jsp";
    }
</script>
</body>
</html>
