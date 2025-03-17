fun main() {
    // Практическая работа №1: Округление чисел
    print("Введите четырехзначное число: ")
    val number = readLine()?.toIntOrNull() ?: 0
    println(roundNumber(number))

    // Практическая работа №2: Правильное окончание для слов
    print("Введите количество лет: ")
    val years = readLine()?.toIntOrNull() ?: 0
    println("$years ${getYearEnding(years)}")
}
fun roundNumber(number: Int): String {
    return if (number >= 1000) {
        "${number / 1000}К"
    } else {
        number.toString()
    }
}
fun getYearEnding(years: Int): String {
    return when {
        years % 100 in 11..14 -> "лет"
        years % 10 == 1 -> "год"
        years % 10 in 2..4 -> "года"
        else -> "лет"
    }
}