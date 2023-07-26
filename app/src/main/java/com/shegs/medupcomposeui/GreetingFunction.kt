package com.shegs.medupcomposeui

import java.util.Calendar

class GreetingFunction {
    val calendar = Calendar.getInstance()
    val hourOfDay = calendar.get(Calendar.HOUR_OF_DAY)

    fun getGreetingText(): String{
        return when (hourOfDay){
            in 0..11 -> "Good Morning"
            in 12..17 -> "Good Afternoon"
            else -> "Good Evening"
        }
    }

    fun getComplimentText(): String {
        val morningCompliments = listOf(
            "We hope you are doing great this morning!",
            "Rise and shine!",
            "It's a beautiful morning! We feel great over here"
        )

        val afternoonCompliments = listOf(
            "It's a sunny after here!",
            "Enjoy your afternoon!",
            "Hope you're having a great day!"
        )

        val eveningCompliments = listOf(
            "Is there a sunset at your end?",
            "Wishing you a peaceful evening!",
            "Time to relax and unwind!"
        )
        return when (hourOfDay){
            in 0..11 -> morningCompliments.random()
            in 12..17 -> afternoonCompliments.random()
            else -> eveningCompliments.random()
        }
    }
}