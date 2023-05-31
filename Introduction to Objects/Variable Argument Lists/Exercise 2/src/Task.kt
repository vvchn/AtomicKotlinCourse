// Varargs/Task2.kt
package variableArgumentListsExercise2

fun printArgs(s: String, vararg nums: Int) {
    println("$s${nums.toList()}")
}

fun main() {
    printArgs("Numbers: ", 1, 2, 3)
}
/* Expected output:
Numbers: [1, 2, 3]
 */