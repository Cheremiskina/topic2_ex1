/*Создать приложение, в котором пользователь вводит две различных цифры. На выходе приложение выдает, если это возможно, из введенных цифр, нечетное число.
Результат выводится в консоль. При невозможности создать нечетное число выводится сообщение – «Создать нечетное число невозможно». Каждое число вводится на отдельной строке*/
fun main(){
    print("Введите первую цифру: ")
    val digit1 = readLine()?.toIntOrNull()
    print("Введите вторую цифру: ")
    val digit2 = readLine()?.toIntOrNull()
    if (digit1 == null || digit2 == null || digit1 !in 0..9 || digit2 !in 0..9) {
        println("Некорректный ввод")
        return
    }
    if(digit1 == 0 || digit2 == 0 || (digit1 % 2 == 0 && digit2 % 2 == 0)){
        println("Создать нечетное число невозможно")
    }
    else if(digit1 % 2 == 0){
        println(digit1.toString()+digit2.toString())
    }
    else if(digit2 % 2 == 0){
        println(digit2.toString()+digit1.toString())
    }
    else if(digit1 == digit2){
        println(digit1.toString()+digit2.toString())
    }
    else{
        println(digit1.toString()+digit2.toString())
        println(digit2.toString()+digit1.toString())
    }
}