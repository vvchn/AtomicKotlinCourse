// CreatingClasses/Task2.kt
package creatingClassesExercise2

class Giraffe() {
    fun displayID() {
     println("$this".substringAfter('@'))
    }
}

fun main() {
    val giraffe1 = Giraffe()
    val giraffe2 = Giraffe()
    val giraffe3 = Giraffe()
    giraffe3.displayID()
    giraffe1.displayID()
    giraffe2.displayID()
}