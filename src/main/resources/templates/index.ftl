<#-- @ftlvariable name="questions" type="kotlin.collections.List<com.example.models.Answer>" -->
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Kotlin Journal</title>
</head>
<body style="text-align: center; font-family: sans-serif">
<img width="400px" src="/static/magic-ball.webp">
<h1>Magic 8 Ball </h1>
<p><i>Answer all your questions!</i></p>
<h3>Ask to the Magic Ball a question</h3>
        <form action="/Magic-Ball-8" method="post">
            <p>
                <input type="text" name="question">
            </p>

            <p>
                <input type="submit">
            </p>
        </form>

<hr>
<#list questions?reverse as question>


<div>
    <h3>
            ${question.question}

    </h3>
    </br>
    <p style="background-color:${question.color};">
        ${question.answer}
    </p>
</div>
</#list>
<hr>

</body>
</html>