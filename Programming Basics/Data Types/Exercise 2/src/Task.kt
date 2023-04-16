// DataTypes/Task2.kt
package dataTypesExercise2

fun main() {
  val int: Int = 10
  val double: Double = 1.1
  val boolean: Boolean = false
  val string: String = "abc"
  val character: Char = 'a'

  // Can be combined:
  // write some examples
  val res1 = int + int
  val res2 = int + double
  val res3 = character + int
  val res4 = double + double
  val res5 = double + int
  val res6 = string + int
  val res7 = string + double
  val res8 = string + boolean
  val res9 = string + string
  val res10 = string + character

  println("The type that can be combined " +
    "with every other type using '+':")
  println("String")

  // Can't be combined:
  // write some examples
  // val res01 = int + boolean
  // val res02 = int + character
  // val res03 = int + string
  // val res04 = double + boolean
  // val res05 = double + character
  // val res06 = double + string
  // val res07 = boolean + int
  // val res08 = boolean + double
  // val res09 = boolean + boolean
  // val res10 = boolean + string
  // val res11 = boolean + character
  // val res12 = character + double
  // val res13 = character + boolean
  // val res14 = character + character
  // val res15 = character + string
}