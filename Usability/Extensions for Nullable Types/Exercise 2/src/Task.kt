// NullableExtensions/Task2.kt
package extensionsForNullableTypesExercise2
import atomictest.eq

fun Boolean?.and(that: Boolean?): Boolean? =
  if (this == null) null else if (that == null) null else this && that

fun Boolean?.or(that: Boolean?): Boolean? =
  if (this == null) null else if (that == null) null else this || that

fun main() {
  val b = true
  b.and(null) eq null
  null.or(b) eq null
  b.or(false) eq true
}