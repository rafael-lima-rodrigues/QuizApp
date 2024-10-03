package com.example.quizapp

object Constants {

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTIONS = "total_questions"
    const val CORRECT_ANSWERS = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1, "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Brazil", "Denmark",
            "Argentina", "Australia", 4
        )
        questionsList.add(que2)

        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "India", "Belgium",
            "Germany", "Kuwait", 2
        )
        questionsList.add(que3)

       val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Germany", "Fiji",
            "Brazil", "Kuwait", 3
        )
        questionsList.add(que4)

       val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Kuwait", "India",
            "Germany", "Denmark", 4
        )
        questionsList.add(que5)

       val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "India", "New Zealand",
            "Fiji", "Kuwait", 3
        )
        questionsList.add(que6)

        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Brazil",
            "Fiji", "India", 1
        )
        questionsList.add(que7)

 val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "New Zealand", "Belgium",
            "Brazil", "India", 4
        )
        questionsList.add(que8)

 val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Germany", "Brazil",
            "Fiji", "Kuwait", 4
        )
        questionsList.add(que9)

 val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Germany", "Brazil",
            "New Zealand", "Kuwait", 3
        )
        questionsList.add(que10)

        return questionsList

    }
}