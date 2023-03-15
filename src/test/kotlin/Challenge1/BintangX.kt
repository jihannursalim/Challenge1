package Challenge1

// Menggunakan konsep OOP : Abstraction
abstract class Pattern {
    protected abstract val size: Int
    protected abstract fun getChar(i: Int, j: Int): Char

    fun draw() {
        for (i in 0 until size) {
            for (j in 0 until size) {
                print(getChar(i, j))
            }
            println()
        }
    }
}

class PatternX(private val patternSize: Int) : Pattern() {
    override val size: Int = patternSize

    override fun getChar(i: Int, j: Int): Char {
        return if (i == j || i + j == size - 1) {
            '*'
        } else {
            ' '
        }
    }
}

fun main() {
    val pattern = PatternX(16)
    pattern.draw()
}
