package Challenge1

// Konsep OOP : Inheritance
open class Shape {
    open fun draw() {
        println("Drawing a shape")
    }
}

class Diamond : Shape() {
    override fun draw() {
        val n = 8
        for (i in 1..n) {
            for (j in 1..n - i) print(" ")
            for (j in 1..2 * i - 1) print("*")
            println()
        }
        for (i in n - 1 downTo 1) {
            for (j in 1..n - i) print(" ")
            for (j in 1..2 * i - 1) print("*")
            println()
        }
    }
}

fun main() {
    val diamond = Diamond()
    diamond.draw()
}
