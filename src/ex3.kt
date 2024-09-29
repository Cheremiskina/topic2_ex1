fun main() {
    var userInput = ""
    var isValidInput = false
    while (!isValidInput){
        println("Введите натуральное число в 10-й системе счисления:")
        userInput = readln()
        if(userInput.all { it.isDigit() } && userInput.toInt() > 0)
            isValidInput = true
        else
            println("Введено неверное значение. Повторите ввод.")
    }
    var binary = arrayOf<Int>()
    var decimal = userInput.toInt()
    while (decimal != 1){
        binary += decimal % 2
        decimal /= 2
    }
    binary += 1
    val resultString = binary.reversedArray()
    println("Число ${userInput.toInt()} в 10-й сс равно числу ${resultString.joinToString("")} в 2-й сс.")
}