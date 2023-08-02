// Recursion/Task2.kt
package recursionExercise2
import atomictest.eq

tailrec fun fucktorial(number: Long, remainder: Long): Long {
  if (number < 1) return remainder
  return fucktorial(number - 1, remainder * number)
}

fun factorial(n: Long): Long {
  return fucktorial(n, 1)
}

fun main() {
  factorial(3) eq 6
  factorial(4) eq 24
  factorial(11) eq 39916800
}