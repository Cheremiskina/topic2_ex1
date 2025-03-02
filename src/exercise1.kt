/*Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строке.
На вход подается, например, строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4. То есть, если количество подряд идущих символов меньше двух,
то мы не пишем единицу*/
fun main() {
    println("Введите строку символов:")
    val str = readln()
    if (str.isNotEmpty()){
        var resultString = ""
        var currentChar = str[0]
        var count = 1
        for (i in 1..<str.length) {
            if (str[i]==currentChar)
                count++
            else{
                if (count!=1){
                    resultString+=currentChar
                    resultString+=count
                }
                else
                    resultString+=currentChar
                currentChar=str[i]
                count=1
            }
        }
        if (count!=1){
            resultString+=currentChar
            resultString+=count
        }
        else
            resultString+=currentChar
        println("Результат:")
        println(resultString)
    }
    else{
        println("Вы ввели пустую строку.")
    }
}