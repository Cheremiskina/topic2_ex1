fun main() {
    println("Введите строку символов:")
    val str = readln()
    var resultString = ""
    var currentChar = str[0]
    var count = 1
    for (i in 1..str.length-1) {
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