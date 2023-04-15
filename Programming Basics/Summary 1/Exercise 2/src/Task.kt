// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var i = 0
  var retStr = ""
  for (it in s) {
    if (i % 2 == 0) retStr += it
    i++
  }
  return retStr
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/