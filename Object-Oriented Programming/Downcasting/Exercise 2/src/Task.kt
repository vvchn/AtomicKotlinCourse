// DownCasting/DownCastEx2.kt
package downcastingExercise2
import downcasting.*
import atomictest.eq

val group: List<Creature> = listOf(
    Human(), Human(), Dog(), Alien(), Dog()
)

fun main() {
    // Kotlin List<R> - returns instances of specified type parameter R
    group.filterIsInstance<Dog>().map { it.bark() } eq "[Yip!, Yip!]"
    // java Class - returns instances of specified class
    group.filterIsInstance(Dog::class.java).map { it.bark() } eq "[Yip!, Yip!]"
}