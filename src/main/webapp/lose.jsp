<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="static text.TextContent.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div><%=LOSE%>
</div>
<button type="button" onclick="restart()" value="<%=RESTART%>" >Restart</button>
<script>
    function restart() {
        window.location.href = "/start.jsp";
    }
</script>
</body>
</html>
