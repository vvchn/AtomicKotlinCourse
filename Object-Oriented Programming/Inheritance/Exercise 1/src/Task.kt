// Inheritance/Task1.kt
package inheritanceExercise1
import atomictest.eq

open class Cleanser {
  var ops = mutableListOf<String>()
    fun dilute() {
        ops += "dilute"
    }
    fun apply() {
        ops += "apply"
    }
    fun scrub() {
        ops += "scrub"
    }
}

open class Detergent : Cleanser()

fun main() {
  val detergent = Detergent()
  detergent.dilute()
  detergent.apply()
  detergent.scrub()
  detergent.ops eq
    listOf("dilute", "apply", "scrub")
}