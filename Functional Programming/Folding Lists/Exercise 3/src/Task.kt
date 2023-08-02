// FoldingLists/Task3.kt
package foldingListsExercise3
import atomictest.eq

fun <T> List<T>.any(predicate: (T) -> Boolean): Boolean =
  fold(false) { d, it -> if(predicate(it)) return true else d }

fun main() {
  val list = listOf(1, -2, 3)
  list.any { it < 0 } eq true
}