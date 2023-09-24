// NestedClasses/NestedEx4.kt
package nestedClassesExercise4

import atomictest.eq
import nestedClassesExercise4.Seat.*

abstract class Seat {
    abstract fun upgrade(): Seat
    abstract fun meal(): String
    override fun toString(): String = "${this::class.simpleName}"
    class Coach : Seat() {
        override fun upgrade(): Seat = Premium()
        override fun meal(): String = "Bag Meal"

    }

    class Premium : Seat() {
        override fun upgrade(): Seat = Business()
        override fun meal(): String = "Bag Meal + Cookie"
    }

    class Business : Seat() {
        override fun upgrade(): Seat = First()
        override fun meal(): String = "Hot Meal"
    }

    class First : Seat() {
        override fun upgrade(): Seat = First()
        override fun meal(): String = "Private Chef"
    }
}

class Ticket(
    private var seat: Seat = Coach()
) {
    fun upgrade(): Seat {
        seat = seat.upgrade()
        return seat
    }
    fun meal() = seat.meal()
    override fun toString() = "$seat"
}

fun main() {
    val tickets = listOf(
        Ticket(),
        Ticket(Premium()),
        Ticket(Business()),
        Ticket(First())
    )
    tickets.map(Ticket::meal) eq
            "[Bag Meal, Bag Meal + Cookie, " +
            "Hot Meal, Private Chef]"
    tickets.map(Ticket::upgrade) eq
            "[Premium, Business, First, First]"
    tickets eq
            "[Premium, Business, First, First]"
    tickets.map(Ticket::meal) eq
            "[Bag Meal + Cookie, Hot Meal, " +
            "Private Chef, Private Chef]"
}