// LoopingAndRanges/Task1.kt
package loopingAndRangesExercise1

fun factorial(n: Int): Long {
    var res: Long = 1
    for (i in 1..n) {
        res *= i
    }
    return res
}

fun main() {
    println(factorial(10))  // 3628800
}