// Polymorphism/Task2.kt
package polymorphismExercise2
import atomictest.*

open class Animal {
  open fun talk() {
    trace("Animal: talk")
  }
  open fun jump() {
    trace("Animal: jump")
    // Runtime polymorphism
    talk()
  }
}

class Frog : Animal() {
  override fun talk() {
    trace("Frog: talk")
    super.talk()
  }
  override fun jump() {
    trace("Frog: jump")
    super.jump()
  }
}
/*
Frog.jump() -> Animal.jump() -> Frog.talk() -> Animal.talk()

Frog: jump
Animal: jump
Frog: talk
Animal: talk
*/
fun main() {
  val animal: Animal = Frog()
  animal.jump()
  trace eq """
    Frog: jump
    Animal: jump
    Frog: talk
    Animal: talk
  """
}