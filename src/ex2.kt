fun main() {
    println("Введите строку символов:")
    val str = readln()
    val charCount = sortedMapOf<Char,Int>()

    for (char in str) {
        charCount[char] = charCount.getOrDefault(char, 0) + 1
    }
    charCount.forEach{entry ->
        println("${entry.key} - ${entry.value}")
    }
}