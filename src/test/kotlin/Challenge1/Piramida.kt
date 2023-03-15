
// Menggunakan SOLID Principle : SRP
fun main() {
    val rows = 8
    val printer = StarPrinter()
    printer.printPyramid(rows)
}

class StarPrinter {
    fun printPyramid(rows: Int) {
        var spaces = rows - 1
        var stars = 1
        for (i in 1..rows) {
            printSpaces(spaces)
            printStars(stars)
            println()
            spaces--
            stars += 2
        }
    }

    private fun printSpaces(count: Int) {
        for (i in 1..count) {
            print("  ")
        }
    }

    private fun printStars(count: Int) {
        for (i in 1..count) {
            print("* ")
        }
    }
}