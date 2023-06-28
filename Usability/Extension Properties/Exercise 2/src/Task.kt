// ExtensionProperties/Task2.kt
package extensionPropertiesExercise2
import atomictest.eq

val <T> List<T>.reversed: List<T>
    // get() = reversed()
    get() {
        val result = mutableListOf<T>()
        for (i in lastIndex downTo 0) {
            result += this[i]
        }
        return result
    }

fun main() {
  val list = listOf(1, 2, 3)
  list.reversed eq listOf(3, 2, 1)
}