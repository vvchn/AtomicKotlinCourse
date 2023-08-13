// ComplexConstructors/Exercise2.kt
package complexConstructorsExercise2
import atomictest.eq

class SumChars(text: String) {
    val sum: Int
    init {
        // fun calc() = text.sumOf { it.code }
        fun calc(): Int {
            var res = 0
            for (i in text) {
                res += i.code
            }
            return res
        }
        sum = calc()
    }
}

fun main() {
   SumChars("What?").sum eq 467
}