// Interfaces/Task2.kt
package interfacesExercise2


interface Pet {
    fun speak(): String
}

class Dog : Pet {
    override fun speak() = "Bark!"
}

class Cat : Pet {
    override fun speak() = "Meow!"
}

class Hamster : Pet {
    override fun speak() = "Squeak!"
}

fun main() {
    val pets = listOf(Dog(), Cat(), Hamster())
    pets.map { println(it.speak()) }
}