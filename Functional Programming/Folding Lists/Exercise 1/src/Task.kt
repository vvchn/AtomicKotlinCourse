// FoldingLists/Task1.kt
package foldingListsExercise1
import atomictest.eq

fun <T> List<T>.size(): Int =
  fold(0) { size, _ -> size + 1 }

fun main() {
  val list = listOf(1, 2, 3)
  list.size() eq 3
}