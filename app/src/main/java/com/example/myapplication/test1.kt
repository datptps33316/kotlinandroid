fun main() {
//    val number = import();
//    val b = import();
//    val perfectNumber = number.isPerfectNumber();
//    val fibonacci = fibonacci(number);
//    val symmetricalNumber = isSymmetricalNumber(number);
//
//    println("$number là số hoàn thiện : $perfectNumber");
//    println("chuỗi fibonacci là $fibonacci")
//    println(" $number là số đối xứng $symmetricalNumber ")
//    println("số $b có chứa trong  $number là :$numberInNumber")
    val a = isContain(

        456789,

        567 );
    println(a);


}

fun Int.isPerfectNumber() = when {
    this < 6 -> false //smallest perfect number
    this % 2 == 1 -> false //no known odd perfect numbers
    else -> (1 until this).filter { this % it == 0 }.sum() == this
}

fun isSymmetricalNumber(number: Int): Boolean {
    val lengthNumber = number.toString().trim().length
    val strNumber = number.toString();
    for (i in 0 until lengthNumber / 2) {
        if (strNumber[i] != strNumber[lengthNumber - i - 1]) {
            return false
        }
    }
    return true;
}

fun fibonacci(n: Int): List<Int> {
    val fibSequence = mutableListOf(1, 1)
    var i = 1
    while (fibSequence[i] + fibSequence[i - 1] <= n) {
        fibSequence.add(fibSequence[i] + fibSequence[i - 1])
        i++
    }
    return fibSequence
}

fun import(): Int {
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

fun isContain(numberA: Int, numberB: Int): Int {
    var flag = -1;
    val arrA = numberA.toString().toCharArray().map { it.toString().toInt() }.toIntArray()
    val arrB = numberB.toString().toCharArray().map { it.toString().toInt() }.toIntArray()
    if (arrA.size < arrB.size) {
        return -1;
    }
    for (i in arrB.indices) {
        if (!arrA.contains(arrB[i])) {
            return -1
        }
        for (j in arrA.indices) {
            if (arrA[j] == arrB[0]) {
                flag = j
                break;
            }
        }
    }
    var k  = 0;
    while (k < arrB.size-1 ) {
         if(arrA[flag+k+1  ] != arrB[k+1]){
             println(arrA[flag+k])
             return  -1 ;
         }
        k++
    }
    return 1
}

