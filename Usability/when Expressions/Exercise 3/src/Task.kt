// WhenExpressions/Task3.kt
package whenExpressionsExercise3
import atomictest.eq

fun balanced(input: String): Boolean {
  var left = 0
  for (i in input) {
    when(i) {
      '(' -> left++
      ')' -> left--
      ' ' -> continue
      else -> throw IllegalArgumentException()
    }
    if (left < 0) return false
  }

  return left == 0
}

fun main() {
  balanced("(()) ()") eq true
  balanced(")(") eq false
}