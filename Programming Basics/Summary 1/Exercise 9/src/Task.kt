// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
  for (i in 1..n) {
    repeat(n - i) {
      print(' ')
    }
    repeat(2 * i - 1) {
      print('#')
    }
    println()
  }
}
/*
if (n <= 0) return
  var i = n
  var j = 1
  while (i > 0) {
    for (k in 0 until i - 1) {
      print(" ")
    }
    for (k in 0 until j) {
      print("#")
    }
    println()
    j += 2
    i--
  }
 */
fun main() {
  printTriangle(6)
}
/* Output:
   #
  ###
 #####
#######
*/