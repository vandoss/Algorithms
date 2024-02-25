fun hulk() {
    val hate = "I hate "
    val love = "I love "
    val that = "that "
    val it = "it"
    var input: Int = 0
    try {
        input= intInput(1, 100)
    } catch (e: NumberFormatException) {
        return
    }
    for (i in input downTo 1) {
        if (i % 2 == 0) {
            print(love)
        } else print(hate)
        if (i != 1) {
            print(that)
        }
    }
    println(it)
}

