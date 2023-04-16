// ExpressionsStatements/Task2.kt
package expressionsAndStatementsExercise2

fun f(first: Int = 0, second: Int = 0) = first + second

fun g(first: String = "", second: String = "") = first + second

fun h() = println("h()")

fun main() {
  val v1: Int = f(2,2)
  val v2: String = g("говно", "залупа")
  val v3: Unit = h()
  println("Int")
  println("String")
  println("Kotlin.Unit")
}