// IntroGenerics/Task1.kt
package introductionToGenericsExercise1
import atomictest.eq
// getOrNull(1)
fun <T> List<T>.secondOrNull(): T? = if (isEmpty() || size < 2) null else this[1]
// getOrNull(size - 2)
fun <T> List<T>.penultimateOrNull(): T? = if (isEmpty() || size < 2) null else this[size - 2]

fun main() {
  val ints = listOf(1, 2, 3)
  ints.secondOrNull() eq 2
  ints.penultimateOrNull() eq 2

  val strings = listOf("a", "b", "c", "d")
  strings.secondOrNull() eq "b"
  strings.penultimateOrNull() eq "c"
}