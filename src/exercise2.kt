/*Создать приложение, которое подсчитывает количество различных символов во введенной строке. Символы в ответе расположить в алфавитном порядке.
Например, дана строка AASADDSS.
На выходе получаем:
A - 3
D - 2
S - 3 */
fun main() {
    println("Введите строку символов:")
    val str = readln()
    if(str.isNotEmpty()){
        val charCount = sortedMapOf<Char,Int>()

        for (char in str) {
            charCount[char] = charCount.getOrDefault(char, 0) + 1
        }
        charCount.forEach{it ->
            println("${it.key} - ${it.value}")
        }
    }
    else{
        println("Вы ввели пустую строку.")
    }
}