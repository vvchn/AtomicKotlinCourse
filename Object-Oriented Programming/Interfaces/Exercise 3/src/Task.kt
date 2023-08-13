// Interfaces/Task3.kt
package interfacesExercise3

interface Pet {
    val sound: String
}

class Dog : Pet {
    override val sound = "Bark!"
}

class Cat : Pet {
    override val sound = "Meow!"
}

class Hamster : Pet {
    override val sound = "Squeak!"
}

fun main() {
    val pets = listOf(Dog(), Cat(), Hamster())
    pets.map { println(it.sound) }
}