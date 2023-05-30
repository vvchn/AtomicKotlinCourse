// Lists/Task2.kt
package listsExercise2

fun countOccurrences(list: IntList, number: Int): Int {
  var c = 0
  for (i in list) {
    if (i == number) c++
  }
  return c
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  println(countOccurrences(list, 2))  // 2
}