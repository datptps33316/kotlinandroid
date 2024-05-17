@file:Suppress("UNUSED_EXPRESSION")

import android.annotation.SuppressLint
import java.util.Scanner
import kotlin.math.pow


fun main() {
    lab2();
}

fun lab2() {
    println("menu ")
    println("1 xuất các số lẽ từ 1 -> n ");
    println("2 xuất các số chẵn 1 -> n ")
    println("3 xuất ra màng hình các số lẽ ko chia hết cho 3");
    println("4 tính các biểu thức ");
    println("5 tính tổng các chữ số của n ");
    val option = selectOption();
    when (option) {
        1 -> printOddNumber();
        2 -> printEvenNumber();
        3 -> findOddNumberDivisibleByThree();
        4 -> calculateExpressions()
        5 -> sumOfDigits();
    }


}

fun importN(): Int {
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

fun selectOption(): Int {
    var option = 0;
    do {
        print("select your  option ");
        val strOption = readLine();
        if (strOption != null) {
            try {
                option = strOption.trim().toInt();
            } catch (_: NumberFormatException) {
                println(" đảm bảo nhập một số nguyên ");
            }
        }
    } while (option <= 0 || option >= 6)
    return option
}

fun printOddNumber() {
    val naturalNumber = importN();
    var oddNumbers = arrayOf<Int>();
    for (i in 1..naturalNumber step 2) {
        oddNumbers += i
    }
    println(oddNumbers.contentToString());
}

fun printEvenNumber() {
    val naturalNumber = importN();
    var evenNumbers = arrayOf<Int>();
    for (i in 2..naturalNumber step 2) {
        evenNumbers += i
    }
    println(evenNumbers.contentToString());
}

fun findOddNumberDivisibleByThree() {
    val naturalNumber = importN();
    var oddNumberDivisibleByThrees = arrayOf<Int>();
    for (i in 1..naturalNumber step 2) {
        if (i % 3 == 0) {
            oddNumberDivisibleByThrees += i;
        }
    }
    println(oddNumberDivisibleByThrees.contentToString());

}

fun sum(naturalNumber: Int) {

    val sum = (1..naturalNumber).sum();
    println("tổng các số 1 đến $naturalNumber là : $sum");
}


fun s3(naturalNumber: Int) {
    var total = 0;
    for (i in 1..naturalNumber) {
        for (j in 2..naturalNumber + 1) {
            total += total + i / j
        }
    }
    println("giá trị biểu thức 1/2 +2/3 +3/4 ... là $total");
}

fun sumOfDigits() {
    val strNumber = importN();
    val stArr = strNumber.toString().toList();
    var sum = 0
    for (i in stArr) {
        sum += i.toString().toInt()
    }
    print("$sum ")
}

@SuppressLint("SuspiciousIndentation")
fun s4(naturalNumber: Int, realNumber: Double) {
    val s = realNumber.pow(naturalNumber);
    println(" x^n bằng : $s ")
}

fun calculateExpressions() {
    val naturalNumber = importN();
    val realNumber = nhapSoThuc();
    sum(naturalNumber);
    s3(naturalNumber);
    s4(naturalNumber, realNumber);

}

fun nhapSoThuc(): Double {
    val scanner = Scanner(System.`in`)
    var x: Double

    while (true) {
        print("Nhập vào một số thực: ")
        try {
            x = scanner.nextDouble()
            break
        } catch (e: Exception) {
            println("Vui lòng nhập lại!")
            scanner.next() // Đọc và loại bỏ dữ liệu không hợp lệ trong buffer
        }
    }
    return x
}

