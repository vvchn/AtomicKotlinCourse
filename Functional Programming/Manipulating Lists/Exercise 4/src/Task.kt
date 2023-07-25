// ManipulatingLists/Task4.kt
package manipulatingListsExercise4
import atomictest.eq
import manipulatingListsExercise5.flatMap

class Person(
  val name: String
) {
  val friends: MutableList<Person> = mutableListOf()

  override fun toString() = "($name, friends: ${friends.map { it.name }})"
}

fun friendSuggestions(person: Person): Set<Person> {
  val res = mutableSetOf<Person>()
  person.friends.forEach { res += it.friends.filter { !person.friends.contains(it)} }
  res.remove(person)
  return res
}

fun main() {
  val alice = Person("Alice")
  val bob = Person("Bob")
  val charlie = Person("Charlie")

  alice.friends += bob
  bob.friends += alice
  bob.friends += charlie
  charlie.friends += bob

  friendSuggestions(alice) eq setOf(charlie)
}