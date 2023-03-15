
// Menggunakan OOP
class InvertedPyramid(private val size: Int) {
    fun draw() {
        for (i in size downTo 1) {
            for (j in 1..size - i) {
                print(" ")
            }
            for (j in 1..2 * i - 1) {
                print("*")
            }
            println()
        }
    }
}

fun main() {
    val pyramid = InvertedPyramid(8)
    pyramid.draw()
}
