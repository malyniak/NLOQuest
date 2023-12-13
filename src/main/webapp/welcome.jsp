<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="static/welcome.css" rel="stylesheet">
</head>
<body>
<div class="form-wrapper">
    <form class="click_form" method="post" action="/welcome">
        <label>
            <input class="option" type="button" name="answer" value="ReadStory" onclick="readStory()">

        </label>
        <div id="textContainer">
        </div>
        <label>
            <input class="option" type="submit" name="answer" value="StartQuest" onclick="startQuest()">
        </label>
    </form>
</div>
<script>
    function startQuest() {
        document.querySelector('.click_form').submit();
    }

    function readStory() {
        let textContainer = document.getElementById('textContainer');
        textContainer.innerHTML = '';
        let titleElement = document.createElement('h2')
        titleElement.textContent = 'Заголовок'
        titleElement.setAttribute("class", "title-h2")
        textContainer.appendChild(titleElement)
        let textElement = document.createElement('p');
        textElement.textContent = "The sun was setting behind the distant hills, casting a warm golden glow across the meadows. Birds chirped as they returned to their nests, and a gentle breeze rustled the leaves in the trees. The tranquility of the evening was interrupted by the distant sound of a train passing by.As twilight descended, the sky transformed into a canvas of vibrant colors—shades of orange, pink, and purple painted across the horizon. The first stars timidly appeared, flickering in the darkening sky. A crescent moon hung low, casting a soft, silver sheen over the landscape.In the nearby village, lights began to illuminate the windows of cozy houses. The aroma of dinner wafted through the air, a comforting blend of spices and home-cooked meals. Children played in the streets, their laughter echoing in the quiet night."
        textContainer.appendChild(textElement);
    }
</script>
</body>
</html>
