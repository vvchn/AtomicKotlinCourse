// NamedAndDefaultArgs/Task1.kt
package namedAndDefaultArgumentsExercise1

class Rectangle(val side1: Double = 1.0,
                val side2: Double = 2.0, val
                color: String = "yellow",) {
  override fun toString(): String {
    return "$color rectangle $side1 x $side2"
  }
}

fun main() {
  println(Rectangle())

  println(Rectangle(228.0))
  println(Rectangle(228.0, 322.0))
  println(Rectangle(side2 = 333.3))
  println(Rectangle(color = "white", side2 = 333.3))
  println(Rectangle(side2 = 222.2, side1 = 111.1))
}