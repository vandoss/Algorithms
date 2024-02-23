fun nextYear() {
    /*
    todo
     Ввести в консоль год 1000 <= year <= 9000
     Вывести ближайший год, который больше введенного и где все цифры разные
    */
    var inputYear: Int = try {
        print("Введите год: ")
        readln().toInt()
    } catch (e: RuntimeException) {
        println("Что-то пошло не так! Буду считать, что Вы ввели 1000")
        1000
    } catch (e: NumberFormatException) {
        println("Что-то пошло не так! Буду считать, что Вы ввели 1000")
        1000
    }
    if (inputYear < 1000 || inputYear > 9000) {
        println("Что-то пошло не так! Буду считать, что Вы ввели 1000")
        inputYear = 1000
    }
    var result = inputYear + 1
    var stringResult = result.toString()
    while (stringResult[0] == stringResult[1] ||
           stringResult[0] == stringResult[2] ||
           stringResult[0] == stringResult[3] ||
           stringResult[1] == stringResult[2] ||
           stringResult[1] == stringResult[3] ||
           stringResult[2] == stringResult[3] ) {
        stringResult = result++.toString()
    }
    println(stringResult)
}