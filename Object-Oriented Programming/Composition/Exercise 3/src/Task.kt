// Composition/Task3.kt
package compositionExercise3
import atomictest.*

class Queue<E> {
  private val queue = ArrayDeque<E>()
  fun put(e: E) = queue.add(e)
  fun poll(): E = queue.removeFirst()
}

fun main() {
  val queue = Queue<String>()
  queue.put("a")
  queue.put("b")
  queue.put("c")
  queue.put("d")
  queue.poll() eq "a"
  queue.poll() eq "b"
}