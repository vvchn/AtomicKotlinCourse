// DownCasting/DownCastEx1.kt
package downcastingExercise1
import atomictest.*

interface Base {
  fun f()
}

class Derived1 : Base {
  override fun f() { trace("Derived1.f()") }
  fun g() { trace("Derived1.g()") }
}

class Derived2 : Base {
  override fun f() { trace("Derived2.f()") }
  fun h() { trace("Derived2.h()") }
}

fun checkAndCall(b: Base) {
  b.f()
  when(b) {
    is Derived1 -> b.g()
    is Derived2 -> b.h()
  }
}

fun main() {
  checkAndCall(Derived1()) // Upcast
  checkAndCall(Derived2()) // Upcast
  trace eq """
    Derived1.f()
    Derived1.g()
    Derived2.f()
    Derived2.h()
  """
}