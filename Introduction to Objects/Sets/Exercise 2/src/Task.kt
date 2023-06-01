// Sets/Task2.kt
package setsExercise2

/*while (!(rs.containsAll((1..25).toSet()))) {
  // rs += (1..25).random()
  rs += Random.nextInt(25) + 1
  c++
}*/

fun experiment(): Int {
    var c = 0
    val set = mutableSetOf<Int>()
    do {
        set += (1..25).random()
        c++
    } while (set.size < 25)
    return c
}

fun main() {
    val counts = mutableListOf<Int>()
    repeat(1000) {
        counts += experiment()
    }
    println(counts.average())
}