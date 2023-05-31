// Varargs/Task4.kt
package variableArgumentListsExercise4
import atomictest.eq

/** Much slower at runtime:
1 – creating N times a new list with new strings
2 – converting N sublists -> array -> string
N + N  */

fun flatten(listOfLists: List<List<String>>): List<String> {
  var res = listOf<String>()
  for (i in listOfLists) {
    res += i.toTypedArray()
  }
  return res
}

/** ANSWER
val result = mutableListOf<String>()
for (list in listOfLists) {
result.addAll(list)
}
return result

Much faster at runtime
1 – Only one creation of mutable list
2 – Fast adding collection (list) element to collection (list)
3 – Only one fast conversion from mutable to immutable list (without reinitialization ones)
1 + N + 1 */

fun main() {
  val listOfLists = listOf(listOf("a", "b"), listOf("c", "d"))
  flatten(listOfLists) eq listOf("a", "b", "c", "d")
}