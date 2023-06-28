// IntroGenerics/Task3.kt
package introductionToGenericsExercise3
import atomictest.eq

class CountingSet<E> {
    private val map = mutableMapOf<E, Int>()
    fun add(element: E) {
        // map[element] = (map[element] ?: 0) + 1
        val check = map[element]
        map[element] = if (check == null) 1 else check + 1
    }
    // map[element] ?: 0
    fun count(element: E) = if (map[element] == null) 0 else map[element]
    fun toSet() = map.keys
}

fun main() {
  val cs = CountingSet<String>()
  cs.add("abc")
  cs.add("abc")
  cs.add("def")
  cs.count("abc") eq 2
  cs.count("def") eq 1
  cs.count("xyz") eq 0
}