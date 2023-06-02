// PropertyAccessors/Task2.kt
package propertyAccessorsExercise2
import atomictest.eq

class Accessible() {
    public var mutable: String = ""
        get() {
            println("mutable:get")
            return field
        }
        set(value) {
            field = value
            println("mutable:set")
        }
    public val readOnly: String
        get() {
            println("readOnly:get")
            return mutable
        }
}

fun main() {
  val accessible = Accessible()
  accessible.mutable = "abc"
  accessible.readOnly eq "abc"
}
/* Expected output:
mutable:set
readOnly:get
mutable:get
abc
 */