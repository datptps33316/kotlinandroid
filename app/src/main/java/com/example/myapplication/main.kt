@file:Suppress("CAST_NEVER_SUCCEEDS")

package com.example.myapplication

fun main() {
//    rankedAcademic();
    val startTime = insertTime("startTime");
    val endTime = insertTime("endTime ");
    val total = calculateTotalPrice(startTime, endTime);
    println(" tiền phải trả $total")

//    val tax = insertTax("nhập thời gian dùng ");
//    val totalPrice = calculateTax(tax);
//    println(totalPrice);

//    val money = insertMoney("nhập số tiền ");
//    calculateInterest(money)



}

fun insertPoint(pointType: String): Float {
    var point: Float = 12.0F;
    do {
        print("Enter $pointType");
        val strPoint = readLine();
        try {
            if (strPoint != null) {
                point = strPoint.trim().toFloat();
                if (!isPoint(point)) {
                    println("Please enter valid scores ");
                }
            };
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter a valid number.");
        }

    } while (!isPoint(point));
    return point;
}

fun isPoint(point: Float): Boolean {
    return point in 0.0F..10.0F;
}

fun calculateTax(time: Int): Int {
    var totalPrice = 0;
    if (time <= 50) {
        totalPrice = time * 700 + 75000;
    }
    if (time in 51..150) {
        totalPrice = (50 * 700) + ((time - 50) * 500) + 75000;
    }
    if (time > 150) {
        totalPrice = (50 * 700) + (100 * 500) + ((time - 150) * 300) + 75000;
    }
    return totalPrice
}

fun calculateAveragePoint(
    test15MinuteScore: Float,
    midtermTestScore: Float,
    endOfTermScore: Float
): Float {
    val averagePoint = (test15MinuteScore + (midtermTestScore * 2) + (endOfTermScore * 3)) / 6;
    return averagePoint;
}

fun printAcademicAchievement(averagePoint: Float) {
    val outstandingScore = 9.5;
    val highScore = 8.0;
    val acceptableScore = 6.0;
    val meanScore = 4.0;
    when {
        averagePoint >= outstandingScore -> println(" hoc luc : xuat sac ");
        averagePoint >= highScore -> println(" hoc luc : Gioi  ");
        averagePoint >= acceptableScore -> println(" hoc luc : kha ");
        averagePoint >= meanScore -> println(" hoc luc : TB  ");
        else -> println(" hoc luc yeu ");
    }
}

fun insertTime(timeType: String): Int {
    var time = 0;
    do {
        println(" enter $timeType");
        val strTime = readLine();
        try {
            if (strTime != null) {
                time = strTime.trim().toInt();
                if (!isTime(time)) {
                    println("vui lòng nhập lại thời gian ")
                }
            }
        } catch (n: NumberFormatException) {
            print("nhập thời gian ko hợp lệ $n")
        }
    } while (!isTime(time));
    return time;
}

fun isTime(time: Int): Boolean {
    return time in 7..23;
}


fun calculateTotalPrice(startTime: Int, endTime: Int): Int {
    var total = 0;
    val oneHour = 10000;
    val spendTime = endTime - startTime;
    // T gian b thường startTime ko  nằm trong [14 ... 16 ]
    // and spendTime smaller 4 hour
    fun isNormalHour(spendTime: Int, startTime: Int): Boolean {
        return startTime !in 14..16 && spendTime in 0..3
    }

    fun isHappyHour(startTime: Int): Boolean {
        return startTime in 14..16;
    }
    total = when {
        isNormalHour(spendTime, startTime) -> oneHour * spendTime;
        isHappyHour(startTime) -> {
            // happyHour + >4 hour
            if (spendTime >= 4) {
                print("happy Hour > 4 hour  ")
                return (oneHour * spendTime) - (((oneHour * 3) + (oneHour * (spendTime - 3) * 0.15)) * 0.1).toInt()
            } else {
                print("happy Hour < 4 hour  ")
                return (oneHour * spendTime) - ((oneHour * spendTime) * 0.1).toInt()
            }
        }
        // spendTime > 4 hour
        else ->
            // spendTime >= 4 hour giam 15%
            ((oneHour * 3) + (oneHour * (spendTime - 3)) - (oneHour * (spendTime - 3) * 0.15F)).toInt();
    }
    return total;
}

fun rankedAcademic() {
    val test15MinuteScore: Float = insertPoint("test15 Minute score");
    val midtermTestScore: Float = insertPoint("midterm Test Score ");
    val endOfTermScore: Float = insertPoint("end Of Term Score ");
    val averagePoint = calculateAveragePoint(test15MinuteScore, midtermTestScore, endOfTermScore);
    printAcademicAchievement(averagePoint);
}

fun insertTax(taxType: String): Int {
    var time = -1;
    fun isTax(time: Int): Boolean {
        return time >= 0
    }
    do {
        print("Nhập $taxType: ")
        val strTax = readLine()
        try {
            if (strTax != null) {
                time = strTax.trim().toInt()
                if (!isTax(time)) {
                    println("Vui lòng nhập số thuế hợp lệ")
                }
            }
        } catch (e: NumberFormatException) {
            println("Đầu vào không hợp lệ. Vui lòng nhập một số nguyên.")
        }
    } while (!isTax(time))
    return time
}

fun calculateInterest(tienGoc: Int) {
    var tienCanTra = tienGoc /6;
    var tienGocConLai = tienGoc;

    for (i in 1 ..6  ) {

        var lai = tienGocConLai*0.01 ;
        tienGocConLai = tienGoc - tienCanTra*i;

        var tong = tienCanTra+lai;

        println("tháng $i ")
        println("tiền góc còn lại $tienGocConLai")
        println("tiền lãi $lai")
        println("tổng tiền cần thanh toán $tong")
    }
}

fun insertMoney(title: String):Int {
    var price = -1;
    do {
        print("nhập số tiền ");

        val strPrice = readLine();
        try {
            if (strPrice != null) {
                price = strPrice.trim().toInt();
                if (!isMoney(price)) {
                    println(" tiền phải là số nguyên ");
                }
            }
        } catch (n: NumberFormatException) {
            print(" nhập dữ liệu không hợp lệ ");
        }
    } while (!isMoney(price));
    return  price;

}

fun isMoney(money: Int): Boolean {
    return money >= 0;
}

