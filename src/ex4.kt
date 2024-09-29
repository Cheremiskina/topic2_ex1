fun main() {
    var userInput: String
    var isValidInput = false
    var number1 = 0.0
    var number2 = 0.0
    var sign = ' '
    while (!isValidInput){
        println("Введите два числа и символ операции (+,-,*,/) в формате ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ:")
        userInput = readln()
        val words = userInput.split(" ")
        if(words.count() == 3 && words[0].toDoubleOrNull() != null && words[1].toDoubleOrNull() != null && words[2].count() == 1 && words[2].firstOrNull() in setOf('+','-','/','*')){
            isValidInput = true
            number1 = words[0].toDouble()
            number2 = words[1].toDouble()
            sign = words[2].first()
        }

        else
            println("Введено неверное значение. Повторите ввод.")
    }
    var result = 0.0
    when (sign){
        '+' -> result = number1+number2
        '-' -> result = number1-number2
        '*' -> result = number1*number2
        '/' -> result = number1/number2
    }
    println("$number1 $sign $number2 = $result")
}