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
            explanation = "'अ' is the first letter of Hindi alphabet and makes the 'A' sound"
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
            correctAnswer = "Ma"
        ),
        Quiz(
            question = "Which is the Hindi letter for 'Ra'?",
            options = listOf("र", "त", "थ", "द"),
            correctAnswer = "र"
        ),
        Quiz(
            question = "What is the Hindi letter 'स' called?",
            options = listOf("Sa", "Sha", "Za", "Ha"),
            correctAnswer = "Sa"
        ),
        Quiz(
            question = "Which letter represents 'Pa' sound?",
            options = listOf("प", "फ", "ब", "भ"),
            correctAnswer = "प"
        ),
        Quiz(
            question = "What is the sound of 'ज'?",
            options = listOf("Ja", "Za", "Ya", "La"),
            correctAnswer = "Ja"
        ),
        Quiz(
            question = "Identify the letter 'न':",
            options = listOf("Na", "Ma", "Pa", "Ta"),
            correctAnswer = "Na"
        ),
        Quiz(
            question = "Which is the Hindi letter for 'Da'?",
            options = listOf("द", "ध", "ड", "ढ"),
            correctAnswer = "द"
        ),
        Quiz(
            question = "What sound does 'ल' make?",
            options = listOf("La", "Ra", "Ya", "Va"),
            correctAnswer = "La"
        )
    )

    val numberQuizzes = listOf(
        Quiz(
            question = "What is 'एक' in English?",
            options = listOf("One", "Two", "Three", "Four"),
            correctAnswer = "One"
        ),
        Quiz(
            question = "Which number is 'पाँच'?",
            options = listOf("5", "6", "7", "8"),
            correctAnswer = "5"
        ),
        Quiz(
            question = "What is 'दस' in English?",
            options = listOf("Ten", "Nine", "Eight", "Seven"),
            correctAnswer = "Ten"
        ),
        Quiz(
            question = "Convert 'तीन' to number:",
            options = listOf("3", "4", "5", "6"),
            correctAnswer = "3"
        ),
        Quiz(
            question = "What is 'सात' in English?",
            options = listOf("Seven", "Six", "Eight", "Nine"),
            correctAnswer = "Seven"
        ),
        Quiz(
            question = "Which is the Hindi word for '2'?",
            options = listOf("दो", "तीन", "चार", "पाँच"),
            correctAnswer = "दो"
        ),
        Quiz(
            question = "What number is 'छह'?",
            options = listOf("6", "7", "8", "9"),
            correctAnswer = "6"
        ),
        Quiz(
            question = "Convert '4' to Hindi:",
            options = listOf("चार", "पाँच", "छह", "सात"),
            correctAnswer = "चार"
        ),
        Quiz(
            question = "What is 'आठ' in English?",
            options = listOf("Eight", "Seven", "Nine", "Ten"),
            correctAnswer = "Eight"
        ),
        Quiz(
            question = "Which number is 'नौ'?",
            options = listOf("9", "8", "7", "6"),
            correctAnswer = "9"
        )
    )

    val colorQuizzes = listOf(
        Quiz(
            question = "What is 'लाल' in English?",
            options = listOf("Red", "Blue", "Green", "Yellow"),
            correctAnswer = "Red"
        ),
        Quiz(
            question = "Which color is 'नीला'?",
            options = listOf("Blue", "Green", "Yellow", "Orange"),
            correctAnswer = "Blue"
        ),
        Quiz(
            question = "What is 'हरा' in English?",
            options = listOf("Green", "Yellow", "Red", "Purple"),
            correctAnswer = "Green"
        ),
        Quiz(
            question = "Convert 'पीला' to English:",
            options = listOf("Yellow", "Orange", "Red", "Blue"),
            correctAnswer = "Yellow"
        ),
        Quiz(
            question = "What color is 'काला'?",
            options = listOf("Black", "White", "Grey", "Brown"),
            correctAnswer = "Black"
        ),
        Quiz(
            question = "Which is Hindi for 'White'?",
            options = listOf("सफेद", "काला", "भूरा", "गुलाबी"),
            correctAnswer = "सफेद"
        ),
        Quiz(
            question = "What is 'नारंगी' in English?",
            options = listOf("Orange", "Yellow", "Red", "Pink"),
            correctAnswer = "Orange"
        ),
        Quiz(
            question = "Convert 'Purple' to Hindi:",
            options = listOf("बैंगनी", "हरा", "नीला", "लाल"),
            correctAnswer = "बैंगनी"
        ),
        Quiz(
            question = "What is 'गुलाबी' in English?",
            options = listOf("Pink", "Red", "Purple", "Orange"),
            correctAnswer = "Pink"
        ),
        Quiz(
            question = "Which color is 'भूरा'?",
            options = listOf("Brown", "Grey", "Black", "White"),
            correctAnswer = "Brown"
        )
    )

    val familyQuizzes = listOf(
        Quiz(
            question = "What is 'माता' in English?",
            options = listOf("Mother", "Father", "Sister", "Brother"),
            correctAnswer = "Mother"
        ),
        Quiz(
            question = "Which relation is 'पिता'?",
            options = listOf("Father", "Mother", "Uncle", "Aunt"),
            correctAnswer = "Father"
        ),
        Quiz(
            question = "What is 'भाई' in English?",
            options = listOf("Brother", "Sister", "Son", "Daughter"),
            correctAnswer = "Brother"
        ),
        Quiz(
            question = "Convert 'बहन' to English:",
            options = listOf("Sister", "Mother", "Aunt", "Daughter"),
            correctAnswer = "Sister"
        ),
        Quiz(
            question = "What relation is 'दादा'?",
            options = listOf("Grandfather", "Father", "Uncle", "Brother"),
            correctAnswer = "Grandfather"
        ),
        Quiz(
            question = "Which is Hindi for 'Grandmother'?",
            options = listOf("दादी", "माता", "बहन", "बेटी"),
            correctAnswer = "दादी"
        ),
        Quiz(
            question = "What is 'चाचा' in English?",
            options = listOf("Uncle", "Father", "Brother", "Grandfather"),
            correctAnswer = "Uncle"
        ),
        Quiz(
            question = "Convert 'Aunt' to Hindi:",
            options = listOf("चाची", "दादी", "बहन", "माता"),
            correctAnswer = "चाची"
        ),
        Quiz(
            question = "What is 'बेटा' in English?",
            options = listOf("Son", "Daughter", "Brother", "Sister"),
            correctAnswer = "Son"
        ),
        Quiz(
            question = "Which relation is 'बेटी'?",
            options = listOf("Daughter", "Sister", "Mother", "Aunt"),
            correctAnswer = "Daughter"
        )
    )

    val directionQuizzes = listOf(
        Quiz(
            question = "What is 'उत्तर' in English?",
            options = listOf("North", "South", "East", "West"),
            correctAnswer = "North"
        ),
        Quiz(
            question = "Which direction is 'दक्षिण'?",
            options = listOf("South", "North", "East", "West"),
            correctAnswer = "South"
        ),
        Quiz(
            question = "What is 'पूर्व' in English?",
            options = listOf("East", "West", "North", "South"),
            correctAnswer = "East"
        ),
        Quiz(
            question = "Convert 'पश्चिम' to English:",
            options = listOf("West", "East", "North", "South"),
            correctAnswer = "West"
        ),
        Quiz(
            question = "What is 'ऊपर' in English?",
            options = listOf("Up", "Down", "Left", "Right"),
            correctAnswer = "Up"
        ),
        Quiz(
            question = "Which is Hindi for 'Down'?",
            options = listOf("नीचे", "ऊपर", "बाएं", "दाएं"),
            correctAnswer = "नीचे"
        ),
        Quiz(
            question = "What is 'बाएं' in English?",
            options = listOf("Left", "Right", "Up", "Down"),
            correctAnswer = "Left"
        ),
        Quiz(
            question = "Convert 'Right' to Hindi:",
            options = listOf("दाएं", "बाएं", "ऊपर", "नीचे"),
            correctAnswer = "दाएं"
        ),
        Quiz(
            question = "What is 'अंदर' in English?",
            options = listOf("Inside", "Outside", "Between", "Around"),
            correctAnswer = "Inside"
        ),
        Quiz(
            question = "Which direction is 'बाहर'?",
            options = listOf("Outside", "Inside", "Between", "Around"),
            correctAnswer = "Outside"
        )
    )

    val animalQuizzes = listOf(
        Quiz(
            question = "What is 'कुत्ता' in English?",
            options = listOf("Dog", "Cat", "Lion", "Tiger"),
            correctAnswer = "Dog"
        ),
        Quiz(
            question = "Which animal is 'बिल्ली'?",
            options = listOf("Cat", "Dog", "Rat", "Rabbit"),
            correctAnswer = "Cat"
        ),
        Quiz(
            question = "What is 'हाथी' in English?",
            options = listOf("Elephant", "Horse", "Camel", "Giraffe"),
            correctAnswer = "Elephant"
        ),
        Quiz(
            question = "Convert 'शेर' to English:",
            options = listOf("Lion", "Tiger", "Leopard", "Bear"),
            correctAnswer = "Lion"
        ),
        Quiz(
            question = "What animal is 'बाघ'?",
            options = listOf("Tiger", "Lion", "Bear", "Wolf"),
            correctAnswer = "Tiger"
        ),
        Quiz(
            question = "Which is Hindi for 'Monkey'?",
            options = listOf("बंदर", "भालू", "लोमड़ी", "भेड़िया"),
            correctAnswer = "बंदर"
        ),
        Quiz(
            question = "What is 'गाय' in English?",
            options = listOf("Cow", "Bull", "Buffalo", "Goat"),
            correctAnswer = "Cow"
        ),
        Quiz(
            question = "Convert 'Bird' to Hindi:",
            options = listOf("पक्षी", "मछली", "सांप", "कछुआ"),
            correctAnswer = "पक्षी"
        ),
        Quiz(
            question = "What is 'भालू' in English?",
            options = listOf("Bear", "Wolf", "Fox", "Deer"),
            correctAnswer = "Bear"
        ),
        Quiz(
            question = "Which animal is 'खरगोश'?",
            options = listOf("Rabbit", "Mouse", "Squirrel", "Rat"),
            correctAnswer = "Rabbit"
        )
    )

    val foodQuizzes = listOf(
        Quiz(
            question = "What is 'चावल' in English?",
            options = listOf("Rice", "Wheat", "Bread", "Corn"),
            correctAnswer = "Rice"
        ),
        Quiz(
            question = "Which food is 'रोटी'?",
            options = listOf("Bread", "Rice", "Curry", "Dal"),
            correctAnswer = "Bread"
        ),
        Quiz(
            question = "What is 'दाल' in English?",
            options = listOf("Lentils", "Rice", "Vegetables", "Curry"),
            correctAnswer = "Lentils"
        ),
        Quiz(
            question = "Convert 'सब्जी' to English:",
            options = listOf("Vegetables", "Fruits", "Meat", "Fish"),
            correctAnswer = "Vegetables"
        ),
        Quiz(
            question = "What food is 'दही'?",
            options = listOf("Yogurt", "Milk", "Butter", "Cheese"),
            correctAnswer = "Yogurt"
        ),
        Quiz(
            question = "Which is Hindi for 'Milk'?",
            options = listOf("दूध", "दही", "घी", "मक्खन"),
            correctAnswer = "दूध"
        ),
        Quiz(
            question = "What is 'फल' in English?",
            options = listOf("Fruit", "Vegetable", "Meat", "Sweet"),
            correctAnswer = "Fruit"
        ),
        Quiz(
            question = "Convert 'Sweet' to Hindi:",
            options = listOf("मिठाई", "नमकीन", "खट्टा", "तीखा"),
            correctAnswer = "मिठाई"
        ),
        Quiz(
            question = "What is 'चाय' in English?",
            options = listOf("Tea", "Coffee", "Milk", "Water"),
            correctAnswer = "Tea"
        ),
        Quiz(
            question = "Which food is 'पनीर'?",
            options = listOf("Cheese", "Butter", "Cream", "Yogurt"),
            correctAnswer = "Cheese"
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