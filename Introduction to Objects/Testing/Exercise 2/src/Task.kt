// Testing/Task2.kt
package testingExercise2
import atomictest.eq
import atomictest.neq

fun sum(a: Int, b: Int, c: Int): Int = a + b + c

fun main() {
  1 + 2 + 3 eq sum(1,2,3)
  2 + 2 + 8 neq sum(3,2,2)
  8 + 0 + 8 eq sum(8, 0,8)
  9 + 8 + 7 neq (7 + 7 + 7)
  0 + 0 + 0 eq (0 + 0 + 0)
}