// BreakAndContinue/Task1.kt
package breakAndContinueExercise1
import atomictest.*

fun readNumbers(vararg n: String) {
  var sum = 0
  var curr: Int?
  for (num in n) {
    curr = num.toIntOrNull()
    if (curr == null) {
      trace("Not a number: $num")
      continue
    }
    if (curr == 0) {
      trace("Sum: $sum")
      break
    }
    sum += curr
  }
}

fun main() {
  readNumbers("1", "a", "3", "10", "0", "19")
  trace eq """
    Not a number: a
    Sum: 14
  """
}