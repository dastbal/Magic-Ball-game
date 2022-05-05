package com.example.models

class Answer
constructor(var question: String) {
    private var answers = listOf<String>(
        "It is certain",
        "Yes- definitely" ,
        "Most Likely",
        "Without a doubt",
        "Ask again",
        "Cannot predict now",
        "Cannot predict now",
        "Concentrate and ask again",
        "Don't count on it",
        "My reply is no",
        "Very doubtful"

    )
    private val numberRandom= (0..11).random()
    val answer: String =  "The answer of your question, $question is -> \n" + answers[numberRandom]
    val color = when(numberRandom){
        in 0..3 -> "green"
        in 4..6 -> "yellow"
        else -> "red"



    }


}

val questions = mutableListOf<Answer>()
