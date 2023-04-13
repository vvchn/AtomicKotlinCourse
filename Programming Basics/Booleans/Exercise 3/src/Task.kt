// Booleans/Task3.kt
package booleansExercise3

fun and(b1: Boolean, b2: Boolean): Boolean =
  if (!b1) false else if (!b2) false else true//TODO()

fun or(b1: Boolean, b2: Boolean): Boolean =
  if (b1) true else if (b2) true else false//TODO()

fun main() {
  println(and(true, true)) // true
  println(or(true, false)) // true
}