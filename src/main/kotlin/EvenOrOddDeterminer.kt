class EvenOrOddDeterminer {
    companion object {
        fun run(number: Int): String {
            return if (number % 2 == 0) {
                "Even"
            } else {
                "Odd"
            }
        }
    }
}