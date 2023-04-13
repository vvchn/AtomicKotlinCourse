// LoopingAndRanges/Task4.kt
package loopingAndRangesExercise4

fun showHalfTriangle(n: Int) {
  repeat(n+1) {
    repeat(it) {
      print('#')
    }
    print("\n")
  } //TODO()
}

fun main() {
  showHalfTriangle(4)
}
/* Output:
#
##
###
####
*/