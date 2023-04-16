// RepetitionWithWhile/Task3.kt
package repetitionWithWhileExercise3

fun sumOfEven(n: Int): Int {
  var i = 0
  var res = 0
  while (i <= n) {
    if (i % 2 == 0) {
      res += i
    }
    i++
  }
  return res
}

fun main() {
  println(sumOfEven(10))  // 30
}