package io.hvk.meradostapp.model

data class Quiz(
    val question: String,
    val options: List<String>,
    val correctAnswer: String,
    val explanation: String? = null
)

object QuizData {
    val letterQuizzes = listOf(
        Quiz(
            question = "What is the Hindi letter 'अ' called?",
            options = listOf("Aa", "E", "O", "U"),
            correctAnswer = "Aa",
            explanation = "'अ' is the first letter of Hindi alphabet"
        ),
        Quiz(
            question = "Which letter makes the 'Ka' sound in Hindi?",
            options = listOf("क", "ख", "ग", "घ"),
            correctAnswer = "क",
            explanation = "'क' is the first consonant in Hindi alphabet"
        )
    )

    val numberQuizzes = listOf(
        Quiz(
            question = "What is 'एक' in English?",
            options = listOf("One", "Two", "Three", "Four"),
            correctAnswer = "One",
            explanation = "'एक' means 'one' in Hindi"
        ),
        Quiz(
            question = "Which number is 'पाँच'?",
            options = listOf("5", "6", "7", "8"),
            correctAnswer = "5",
            explanation = "'पाँच' represents the number 5 in Hindi"
        )
    )

    val colorQuizzes = listOf(
        Quiz(
            question = "What is 'लाल' in English?",
            options = listOf("Red", "Blue", "Green", "Yellow"),
            correctAnswer = "Red",
            explanation = "'लाल' means 'red' in Hindi"
        ),
        Quiz(
            question = "Which color is 'नीला'?",
            options = listOf("Blue", "Green", "Yellow", "Orange"),
            correctAnswer = "Blue",
            explanation = "'नीला' represents the color blue in Hindi"
        )
    )

    val familyQuizzes = listOf(
        Quiz(
            question = "What is 'माता' in English?",
            options = listOf("Mother", "Father", "Sister", "Brother"),
            correctAnswer = "Mother",
            explanation = "'माता' means 'mother' in Hindi"
        ),
        Quiz(
            question = "Which relation is 'पिता'?",
            options = listOf("Father", "Mother", "Uncle", "Aunt"),
            correctAnswer = "Father",
            explanation = "'पिता' means 'father' in Hindi"
        )
    )

    val directionQuizzes = listOf(
        Quiz(
            question = "What is 'उत्तर' in English?",
            options = listOf("North", "South", "East", "West"),
            correctAnswer = "North",
            explanation = "'उत्तर' means 'north' in Hindi"
        ),
        Quiz(
            question = "Which direction is 'दक्षिण'?",
            options = listOf("South", "North", "East", "West"),
            correctAnswer = "South",
            explanation = "'दक्षिण' means 'south' in Hindi"
        )
    )

    val animalQuizzes = listOf(
        Quiz(
            question = "What is 'कुत्ता' in English?",
            options = listOf("Dog", "Cat", "Lion", "Tiger"),
            correctAnswer = "Dog",
            explanation = "'कुत्ता' means 'dog' in Hindi"
        ),
        Quiz(
            question = "Which animal is 'बिल्ली'?",
            options = listOf("Cat", "Dog", "Rat", "Rabbit"),
            correctAnswer = "Cat",
            explanation = "'बिल्ली' means 'cat' in Hindi"
        )
    )

    val foodQuizzes = listOf(
        Quiz(
            question = "What is 'चावल' in English?",
            options = listOf("Rice", "Wheat", "Bread", "Corn"),
            correctAnswer = "Rice",
            explanation = "'चावल' means 'rice' in Hindi"
        ),
        Quiz(
            question = "Which food is 'रोटी'?",
            options = listOf("Bread", "Rice", "Curry", "Dal"),
            correctAnswer = "Bread",
            explanation = "'रोटी' means 'bread' in Hindi"
        )
    )

    fun getQuizzesByCategory(categoryId: String): List<Quiz> {
        return when (categoryId) {
            "letters" -> letterQuizzes
            "numbers" -> numberQuizzes
            "colors" -> colorQuizzes
            "family" -> familyQuizzes
            "directions" -> directionQuizzes
            "animals" -> animalQuizzes
            "foods" -> foodQuizzes
            else -> emptyList()
        }
    }
} 