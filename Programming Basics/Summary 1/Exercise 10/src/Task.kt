// Summary1/Task10.kt
package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
  if (rows <= 0 || columns <= 0) return
  var width = 1
  var num = rows * columns - 1
  //val width = (rows * columns).toString().length + 1
  while (num > 0) {
    width++
    num /= 10
  }
  num = 0
  for (i in 0 until rows) {
    for (j in 0 until columns) {
      if (i % 2 == 0) {
        print("%${width}d".format(num))
        num++
      }
      else {
        print("%${width}d".format(num + columns - 1 - j))
      }
    }
    if (i % 2 != 0) {
      num += columns
    }
    println()
  }
}

fun main() {
  showSnake(2, 3)
  println()
  showSnake(4, 5)
}
/* Output:
 0 1 2
 5 4 3

  0  1  2  3  4
  9  8  7  6  5
 10 11 12 13 14
 19 18 17 16 15
*/