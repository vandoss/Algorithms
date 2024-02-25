fun intInput (start: Int, finish: Int): Int {
    var input: Int = 0
        try {
            print("Enter the number: ")
            input = readln().toInt()
        } catch (e: NumberFormatException) {
            println("Enter the number!")
            throw NumberFormatException()
        } catch (e: RuntimeException) {
            println("Something goes wrong!")
            throw NumberFormatException()
        } catch (e: CharacterCodingException) {
            println("Something goes wrong!")
            throw NumberFormatException()
        }
        if (input < start || input > finish) {
            println("Enter number between $start and $finish inclusive!")
            throw NumberFormatException()
        }
    return input
}
