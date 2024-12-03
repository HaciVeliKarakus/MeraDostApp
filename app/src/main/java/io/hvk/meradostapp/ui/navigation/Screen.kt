sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Quiz : Screen("quiz")
    object LectureDetail : Screen("lecture/{lectureId}") {
        fun createRoute(lectureId: String) = "lecture/$lectureId"
    }
    object QuizCategory : Screen("quiz/{categoryId}") {
        fun createRoute(categoryId: String) = "quiz/$categoryId"
    }
} 