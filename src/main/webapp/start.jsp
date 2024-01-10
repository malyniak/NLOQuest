
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Quiz</title>

    <link href="static/start.css" rel="stylesheet">
</head>
<body>
<h2 class="welcome">
    <c:if test="${not empty sessionScope.player}">
        Ласкаво просимо,  <c:out value="${sessionScope.player} " escapeXml="false"/>!
    </c:if>
</h2>
<div class="form-wrapper">
<div class="question" >"Ви втрачаєте пам'ять. Прийняти виклик НЛО?"</div>

        <form class="click_form" method="post" action="/start" >
            <label>
                <input class="option" type="radio" name="answer" value="accept" required>
                "Прийняти виклик"
            </label>
        <br>
        <label>
            <input class="option" type="radio" name="answer" value="reject" required> "Відхилити виклик"
        </label>
        <br>
        <button class="ui-button" type="submit">"Відправити відповідь"</button>
    </form>

    </div>
</body>
</html>
