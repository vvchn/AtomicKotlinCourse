// ObjectsEverywhere/Task3.kt
package objectsEverywhereExercise3

fun isPalindrome(s: String): Boolean =
  s.reversed() == s

fun isPalIgnoreCase(s: String): Boolean =
  isPalindrome(s.lowercase())

fun isPalIgnoreSpecial(s: String): Boolean {
  var ns = ""
  for (ch in s) {
    if ((ch in 'a'..'z') || (ch in 'A'..'Z')) {
      ns += ch
    }
  }
  return isPalIgnoreCase(ns)
}

fun main() {
  println(isPalIgnoreSpecial("Was It A Rat I Saw? ..."))  // true
}