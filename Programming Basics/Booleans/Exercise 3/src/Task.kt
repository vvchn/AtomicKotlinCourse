// Booleans/Task3.kt
package booleansExercise3

fun and(b1: Boolean, b2: Boolean): Boolean =
  if (!b1) false else if (!b2) false else true
// if (b1) b2 else false
fun or(b1: Boolean, b2: Boolean): Boolean =
  if (b1) true else if (b2) true else false
// if(b1) true else b2
fun main() {
  println(and(true, true)) // true
  println(or(true, false)) // true
}