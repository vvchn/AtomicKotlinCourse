// DownCasting/DownCastEx3.kt
package downcastingExercise3
import atomictest.*

interface Animal1

interface Animal2 {
    fun move()
}

class Worm1 : Animal1 {
    fun wriggle() = trace("Wriggle")
}

class Worm2 : Animal2 {
    override fun move() = trace("Wriggle")
}

class Snail1 : Animal1 {
    fun slide() = trace("Slide")
}

class Snail2 : Animal2 {
    override fun move() = trace("Slide")
}

class Beetle1 : Animal1 {
    fun walk() = trace("Walk")
}

class Beetle2 : Animal2 {
    override fun move() = trace("Walk")
}


fun move(a1: Animal1) {
    when(a1) {
        is Worm1 -> a1.wriggle()
        is Snail1 -> a1.slide()
        is Beetle1 -> a1.walk()
    }
}

fun main() {
    val list1 = listOf(Worm1(), Snail1(), Beetle1())
    list1.forEach { move(it) }

    val list2 = listOf(Worm2(), Snail2(), Beetle2())
    list2.forEach { it.move() }

    trace eq """
    Wriggle
    Slide
    Walk
    Wriggle
    Slide
    Walk
  """

}