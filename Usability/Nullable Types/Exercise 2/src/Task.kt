// NullableTypes/Task2.kt
package nullableTypesExercise2

import namedAndDefaultArgumentsExercise2.SimpleTime

fun zilch(): String? = null
 fun zilch2() = zilch()

fun main() {
   var x: String? = zilch()
   var y: String? = zilch2()
}