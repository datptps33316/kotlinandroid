@file:Suppress("UNUSED_EXPRESSION")




fun main(){
test();
}

fun imp() :Int{
    var n: Int
    while (true) {
        println("Enter a natural number greater than 0:")
        try {
            n = readLine()?.trim()?.toInt() ?: throw NumberFormatException()
            if (n > 0) {
                break
            } else {
                println("Please enter a number greater than 0.")
            }
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter a valid number.")
        }
    }
    return n
}
fun findFirstOfDigit(number: Int){
    val numberString: String = number.toString()
    val firstLetterChar = numberString[0]
    println("số đầu tiên trong chuỗi $firstLetterChar");
    if(isOddNumber(firstLetterChar.toString().toInt())){
        println("a là số chẵn ");
    }else{
        println(" a laf số lẽ ");
    }
}
fun isOddNumber (a :Int): Boolean {
    return a%2 == 0 ;
}
fun test (){
    val number = imp();
    findFirstOfDigit(number);
    val flag = check(number.toString());
    if(flag == true){
        println(" giảm dần từ trai sang ")
    }else{
        println(" ko giảm dần ")
    }
}
fun check ( abc :String):Boolean{
    val arrAbcs = abc.map { it.toString().toInt() }
    for (i in 0 until arrAbcs.size - 1) {
        if (arrAbcs[i] <= arrAbcs[i + 1]) {
            return false
        }
    }
    return true
}


