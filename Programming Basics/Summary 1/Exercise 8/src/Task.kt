// Summary1/Task8.kt
package summaryIExercise8

fun reverseDecimal(number: Int): Int {
  var num = number
  var res = 0
  while (num > 0) {
    res *= 10
    res += num % 10
    num /= 10
  }
  return res
}

fun main() {
  println(reverseDecimal(1234))  // 4321
}