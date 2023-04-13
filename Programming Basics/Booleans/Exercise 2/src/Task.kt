// Booleans/Task2.kt
package booleansExercise2

fun showAnd(first: Boolean, second: Boolean) {
    println("$first && $second == ${first && second}")
}

fun showOr(first: Boolean, second: Boolean) {
    println("$first || $second == ${first || second}")
}

fun showTruthTable() {
    showAnd(first = false, second = false)//TODO()
    showAnd(first = false, second = true)
    showAnd(first = true, second = false)
    showAnd(first = true, second = true)
    showOr(first = false, second = false)
    showOr(first = false, second = true)
    showOr(first = true, second = false)
    showOr(first = true, second = true)

}

fun main() {
    showTruthTable()
}