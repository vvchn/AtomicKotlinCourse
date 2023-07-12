// HigherOrderFunctions/Task2.kt
package higherOrderFunctionsExercise2
import atomictest.eq
import extensionFunctionsExercise2.isEven

fun List<Int>.transformVersion1(): List<Int> =
  filter { it % 2 == 0 }.map { it * it }

fun List<Int>.transformVersion2(): List<Int> =
  mapNotNull { if (!it.isEven()) null else it * it }

fun main() {
  val list = listOf(1, 2, 3)
  list.transformVersion1() eq listOf(4)
  list.transformVersion2() eq listOf(4)
}