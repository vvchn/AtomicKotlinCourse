// ClassDelegation/Task3.kt
package classDelegationExercise3
import atomictest.*

interface A {
  fun foo()
  fun bar()
}

interface B {
  fun foo()
  fun baz()
}

class AA : A {
  override fun foo() {
    trace("AA.foo()")
  }

  override fun bar() {
    trace("AA.bar()")
  }

}

class BB : B {
  override fun foo() {
    trace("BB.foo()")
  }

  override fun baz() {
    trace("BB.baz()")
  }

}

class Delegation(private val aa: A, private val bb: B) : A by aa, B by bb {
  // Class 'Delegation' must override public open fun foo():
  // Unit defined in classDelegationExercise3.Delegation because it inherits many implementations of it
  override fun foo() {
    // Exception in thread "main" java.lang.StackOverflowError
    //foo()
    aa.foo()
    bb.foo()
    trace("Delegation.foo()")
  }
}

fun main() {
  val d = Delegation(AA(), BB())
  d.foo()
  d.bar()
  d.baz()
  trace eq
    """
      AA.foo()
      BB.foo()
      Delegation.foo()
      AA.bar()
      BB.baz()
    """
}