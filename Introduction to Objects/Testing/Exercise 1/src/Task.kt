// Testing/Task1.kt
package testingExercise1
import atomictest.eq

fun abs(number: Int): Int = if (number >= 0) number else -number

fun main() {
  0 eq abs(0)
  42 eq abs(42)
  -239 eq abs(-239)
}