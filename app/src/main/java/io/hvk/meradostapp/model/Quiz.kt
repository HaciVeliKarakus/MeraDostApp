package io.hvk.meradostapp.model

import io.hvk.meradostapp.R

data class Quiz(
    val question: String,
    val options: List<String>,
    val correctAnswer: String,
    val explanation: String? = null,
    val icon: Int? = null
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
        ),
        Quiz(
            question = "What sound does 'म' make?",
            options = listOf("Ma", "Na", "Pa", "Ta"),
            correctAnswer = "Ma",
            explanation = "'म' makes the 'ma' sound as in 'mother'"
        ),
        Quiz(
            question = "Which letter represents 'Pa' sound?",
            options = listOf("प", "फ", "ब", "भ"),
            correctAnswer = "प",
            explanation = "'प' makes the 'pa' sound as in 'pen'"
        ),
        Quiz(
            question = "What is the sound of 'ज'?",
            options = listOf("Ja", "Za", "Ya", "La"),
            correctAnswer = "Ja",
            explanation = "'ज' makes the 'ja' sound as in 'joy'"
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
        ),
        Quiz(
            question = "Convert '3' to Hindi:",
            options = listOf("तीन", "चार", "पाँच", "छह"),
            correctAnswer = "तीन",
            explanation = "'तीन' is the Hindi word for number 3"
        ),
        Quiz(
            question = "What is 'दो' in English?",
            options = listOf("2", "3", "4", "5"),
            correctAnswer = "2",
            explanation = "'दो' means 'two' in Hindi"
        ),
        Quiz(
            question = "Which is the correct Hindi for '4'?",
            options = listOf("चार", "तीन", "पाँच", "छह"),
            correctAnswer = "चार",
            explanation = "'चार' represents the number 4 in Hindi"
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
        ),
        Quiz(
            question = "What is 'हरा' in English?",
            options = listOf("Green", "Blue", "Yellow", "Red"),
            correctAnswer = "Green",
            explanation = "'हरा' means 'green' in Hindi"
        ),
        Quiz(
            question = "Which is the Hindi word for 'Yellow'?",
            options = listOf("पीला", "नीला", "लाल", "काला"),
            correctAnswer = "पीला",
            explanation = "'पीला' means 'yellow' in Hindi"
        ),
        Quiz(
            question = "What color is 'काला'?",
            options = listOf("Black", "White", "Brown", "Grey"),
            correctAnswer = "Black",
            explanation = "'काला' represents the color black in Hindi"
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
        ),
        Quiz(
            question = "What is 'बहन' in English?",
            options = listOf("Sister", "Brother", "Aunt", "Mother"),
            correctAnswer = "Sister",
            explanation = "'बहन' means 'sister' in Hindi"
        ),
        Quiz(
            question = "Which is the Hindi word for 'Brother'?",
            options = listOf("भाई", "बहन", "बेटा", "बेटी"),
            correctAnswer = "भाई",
            explanation = "'भाई' means 'brother' in Hindi"
        ),
        Quiz(
            question = "What relation is 'दादी'?",
            options = listOf(
                "Paternal Grandmother",
                "Maternal Grandmother",
                "Aunt",
                "Mother"
            ),
            correctAnswer = "Paternal Grandmother",
            explanation = "'दादी' means father's mother (paternal grandmother)"
        )
    )

    val greetingQuizzes = listOf(
        Quiz(
            question = "What does 'नमस्ते' mean?",
            options = listOf("Hello", "Goodbye", "Good Night", "Thank You"),
            correctAnswer = "Hello",
            explanation = "'नमस्ते' is a common greeting meaning 'hello'"
        ),
        Quiz(
            question = "Which phrase means 'Good Morning'?",
            options = listOf(
                "शुभ प्रभात",
                "शुभ रात्रि",
                "धन्यवाद",
                "फिर मिलेंगे"
            ),
            correctAnswer = "शुभ प्रभात",
            explanation = "'शुभ प्रभात' means 'good morning' in Hindi"
        ),
        Quiz(
            question = "What is 'धन्यवाद' in English?",
            options = listOf("Thank You", "Hello", "Goodbye", "Good Night"),
            correctAnswer = "Thank You",
            explanation = "'धन्यवाद' means 'thank you' in Hindi"
        ),
        Quiz(
            question = "Which is the correct greeting for night time?",
            options = listOf(
                "शुभ रात्रि",
                "शुभ प्रभात",
                "नमस्ते",
                "धन्यवाद"
            ),
            correctAnswer = "शुभ रात्रि",
            explanation = "'शुभ रात्रि' means 'good night' in Hindi"
        ),
        Quiz(
            question = "What does 'फिर मिलेंगे' mean?",
            options = listOf(
                "See you again",
                "Good Morning",
                "Thank You",
                "Hello"
            ),
            correctAnswer = "See you again",
            explanation = "'फिर मिलेंगे' means 'see you again' in Hindi"
        )
    )

    val animalQuizzes = listOf(
        Quiz(
            question = "What is 'कुत्ता' in English?",
            options = listOf("Dog", "Cat", "Lion", "Tiger"),
            correctAnswer = "Dog",
            explanation = "'कुत्ता' means 'dog' in Hindi",
        ),
        Quiz(
            question = "Which animal is 'बिल्ली'?",
            options = listOf("Cat", "Dog", "Rat", "Rabbit"),
            correctAnswer = "Cat",
            explanation = "'बिल्ली' means 'cat' in Hindi",
        ),
        Quiz(
            question = "What is 'हाथी' in English?",
            options = listOf("Elephant", "Horse", "Camel", "Giraffe"),
            correctAnswer = "Elephant",
            explanation = "'हाथी' means 'elephant' in Hindi",
        ),
        Quiz(
            question = "Which animal is 'शेर'?",
            options = listOf("Lion", "Tiger", "Leopard", "Bear"),
            correctAnswer = "Lion",
            explanation = "'शेर' means 'lion' in Hindi",
        ),
        Quiz(
            question = "What is 'बाघ' in English?",
            options = listOf("Tiger", "Lion", "Panther", "Wolf"),
            correctAnswer = "Tiger",
            explanation = "'बाघ' means 'tiger' in Hindi",
        ),
        Quiz(
            question = "Which is the Hindi word for 'Monkey'?",
            options = listOf("बंदर", "भालू", "लोमड़ी", "भेड़िया"),
            correctAnswer = "बंदर",
            explanation = "'बंदर' means 'monkey' in Hindi",
        ),
        Quiz(
            question = "What is 'गाय' in English?",
            options = listOf("Cow", "Bull", "Buffalo", "Goat"),
            correctAnswer = "Cow",
            explanation = "'गाय' means 'cow' in Hindi",
        ),
        Quiz(
            question = "Which animal is 'भालू'?",
            options = listOf("Bear", "Wolf", "Fox", "Deer"),
            correctAnswer = "Bear",
            explanation = "'भालू' means 'bear' in Hindi",
        ),
        Quiz(
            question = "What is 'खरगोश' in English?",
            options = listOf("Rabbit", "Mouse", "Squirrel", "Rat"),
            correctAnswer = "Rabbit",
            explanation = "'खरगोश' means 'rabbit' in Hindi",
        ),
        Quiz(
            question = "Which is the Hindi word for 'Bird'?",
            options = listOf("पक्षी", "मछली", "सांप", "कछुआ"),
            correctAnswer = "पक्षी",
            explanation = "'पक्षी' means 'bird' in Hindi",
        )
    )

    val directionQuizzes = listOf(
        Quiz(
            question = "What is 'पूर्व' in English?",
            options = listOf("East", "West", "North", "South"),
            correctAnswer = "East",
            explanation = "'पूर्व' means 'east' in Hindi",
        ),
        Quiz(
            question = "Which direction is 'पश्चिम'?",
            options = listOf("East", "West", "North", "South"),
            correctAnswer = "West",
            explanation = "'पश्चिम' means 'west' in Hindi",
        ),
        Quiz(
            question = "What is 'उत्तर' in English?",
            options = listOf("North", "South", "East", "West"),
            correctAnswer = "North",
            explanation = "'उत्तर' means 'north' in Hindi",
        ),
        Quiz(
            question = "Which direction is 'दक्षिण'?",
            options = listOf("East", "West", "North", "South"),
            correctAnswer = "South",
            explanation = "'दक्षिण' means 'south' in Hindi",
        ),
        Quiz(
            question = "What is 'उत्तर-पूर्व' in English?",
            options = listOf("Northeast", "Northwest", "Southeast", "Southwest"),
            correctAnswer = "Northeast",
            explanation = "'उत्तर-पूर्व' means 'northeast' in Hindi",
        ),
        Quiz(
            question = "Which direction is 'दक्षिण-पश्चिम'?",
            options = listOf("Northeast", "Northwest", "Southeast", "Southwest"),
            correctAnswer = "Southwest",
            explanation = "'दक्षिण-पश्चिम' means 'southwest' in Hindi",
        ),
        Quiz(
            question = "What is 'उत्तर-पश्चिम' in English?",
            options = listOf("Northwest", "Northeast", "Southwest", "Southeast"),
            correctAnswer = "Northwest",
            explanation = "'उत्तर-पश्चिम' means 'northwest' in Hindi",
        ),
        Quiz(
            question = "Which direction is 'दक्षिण-पूर्व'?",
            options = listOf("Northeast", "Northwest", "Southeast", "Southwest"),
            correctAnswer = "Southeast",
            explanation = "'दक्षिण-पूर्व' means 'southeast' in Hindi",
        ),
        Quiz(
            question = "What is 'दिशा' in English?",
            options = listOf("Direction", "Speed", "Distance", "Location"),
            correctAnswer = "Direction",
            explanation = "'दिशा' means 'direction' in Hindi",
        ),
        Quiz(
            question = "Which word represents 'location' in Hindi?",
            options = listOf("स्थान", "दिशा", "गति", "दूरी"),
            correctAnswer = "स्थान",
            explanation = "'स्थान' means 'location' in Hindi",
        )
    )

    val foodQuizzes = listOf(
        Quiz(
            question = "What is 'आलू' in English?",
            options = listOf("Potato", "Onion", "Tomato", "Carrot"),
            correctAnswer = "Potato",
            explanation = "'आलू' means 'potato' in Hindi"
        ),
        Quiz(
            question = "Which food is 'चावल'?",
            options = listOf("Rice", "Wheat", "Barley", "Oats"),
            correctAnswer = "Rice",
            explanation = "'चावल' means 'rice' in Hindi"
        ),
        Quiz(
            question = "What is 'साबूदाना' in English?",
            options = listOf("Sago", "Rice", "Barley", "Lentils"),
            correctAnswer = "Sago",
            explanation = "'साबूदाना' means 'sago' in Hindi"
        ),
        Quiz(
            question = "Which is the Hindi word for 'Bread'?",
            options = listOf("रोटी", "नान", "पाव", "कचोरी"),
            correctAnswer = "रोटी",
            explanation = "'रोटी' means 'bread' in Hindi"
        ),
        Quiz(
            question = "What is 'फल' in English?",
            options = listOf("Fruit", "Vegetable", "Grain", "Nut"),
            correctAnswer = "Fruit",
            explanation = "'फल' means 'fruit' in Hindi"
        ),
        Quiz(
            question = "What is 'दूध' in English?",
            options = listOf("Milk", "Water", "Juice", "Tea"),
            correctAnswer = "Milk",
            explanation = "'दूध' means 'milk' in Hindi"
        ),
        Quiz(
            question = "Which food is 'मिठाई'?",
            options = listOf("Sweet", "Salty", "Spicy", "Sour"),
            correctAnswer = "Sweet",
            explanation = "'मिठाई' means 'sweet' in Hindi"
        ),
        Quiz(
            question = "What is 'टमाटर' in English?",
            options = listOf("Tomato", "Carrot", "Cucumber", "Pumpkin"),
            correctAnswer = "Tomato",
            explanation = "'टमाटर' means 'tomato' in Hindi"
        ),
        Quiz(
            question = "Which is the Hindi word for 'Vegetable'?",
            options = listOf("सब्जी", "फल", "अनाज", "मांस"),
            correctAnswer = "सब्जी",
            explanation = "'सब्जी' means 'vegetable' in Hindi"
        ),
        Quiz(
            question = "What is 'मांस' in English?",
            options = listOf("Meat", "Fish", "Egg", "Cheese"),
            correctAnswer = "Meat",
            explanation = "'मांस' means 'meat' in Hindi"
        )
    )

    fun getQuizzesByCategory(categoryId: String): List<Quiz> {
        return when (categoryId) {
            "letters" -> letterQuizzes
            "numbers" -> numberQuizzes
            "colors" -> colorQuizzes
            "family" -> familyQuizzes
            "greetings" -> greetingQuizzes
            "animals" -> animalQuizzes
            "directions" -> directionQuizzes
            "foods" -> foodQuizzes
            else -> emptyList()
        }
    }
} 