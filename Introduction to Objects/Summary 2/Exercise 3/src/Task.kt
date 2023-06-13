// Summary2/Task3.kt
package summaryIIExercise3
import atomictest.*

class FixedSizeHolder(private val _size: Int) {
    private val holder = mutableListOf<Any>()

    val size: Int
        get() = holder.size

    val full: Boolean
        get() = holder.size >= _size

    fun add(obj: Any) {
        if (full) throw IllegalStateException("The container is full")
        holder.add(obj)
    }
}

fun main() {
  val holder = FixedSizeHolder(2)
  holder.add("What is the answer?")
  holder.add(42)
  holder.full eq true
  holder.size eq 2
  capture {
    holder.add("!!!")
  } eq "IllegalStateException: The container is full"
}