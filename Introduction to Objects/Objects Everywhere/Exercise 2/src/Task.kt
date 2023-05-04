// ObjectsEverywhere/Task2.kt
package objectsEverywhereExercise2

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  s.lowercase() == s.reversed().lowercase()

fun main() {
  println(isPalIgnoreCase("Mom"))  // true
}