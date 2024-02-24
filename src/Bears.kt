import kotlin.math.log

fun bears() {
    var continueGame: Boolean = true
    while (continueGame) {
        println("Введите 2 целых числа от 1 до 10 через пробел так, чтобы первое число было меньше или равно второму")
        val inputString: String = readLine() ?: ""
        var weightLimak = 0
        var weightBob = 0
        try {
            if (inputString.isNotEmpty()) {
                weightLimak = inputString.split(' ')[0].toInt()
                weightBob = inputString.split(' ')[1].toInt()
            }
        } catch (e: IndexOutOfBoundsException) {
            println("Кажется, Вы забыли пробел!")
        } catch (e: NumberFormatException) {
            println("Надо вводить 2 целых числа!")
        }
        if (0 < weightLimak && weightLimak <= weightBob && weightBob <= 10) {
            val result = log(weightBob.toDouble() / weightLimak.toDouble(), 1.5)
            val intResult: Int = result.toInt() + 1
            println(intResult)
        } else {
            println("Не соблюдены условия ввода!")
        }
        println("Попробуете еще раз? (y/n):")
        if (readLine() != "y") {
            continueGame = false
        }
    }
}

