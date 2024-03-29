// Polymorphism/Task1.kt
package polymorphismExercise1
import atomictest.*
import usingoperators.F

abstract class Character(val name: String) {
  abstract fun play(): String
}

interface Fighter {
  fun fight() = "Fight!"
}

interface Magician {
  fun doMagic() = "Magic!"
}

interface Flyer {
  fun fly() = "Fly!"
}

class Warrior :
  Character("Warrior"), Fighter {
  override fun play() = fight()
}

open class Elf(name: String = "Elf") :
  Character(name), Magician {
  override fun play() = doMagic()
}

class FightingElf :
  Elf("FightingElf"), Fighter {
  override fun play() =
    super.play() + fight()
}

class Dragon : Character("Dragon"), Flyer {
  override fun play() = super.fly()
}

class Wizard: Character("Wizard"), Magician, Flyer {
  override fun play() = doMagic() + fly()
}

fun Character.playTurn() = name + ": " + play()

fun main() {
  listOf(
    Warrior(),
    Elf(),
    FightingElf(),
    Dragon(),
    Wizard()
  ).map { it.playTurn() } eq
    "[Warrior: Fight!, Elf: Magic!, " +
    "FightingElf: Magic!Fight!, " +
    "Dragon: Fly!, Wizard: Magic!Fly!]"
}