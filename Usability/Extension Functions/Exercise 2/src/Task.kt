// ExtensionFunctions/Task2.kt
package extensionFunctionsExercise2
import aaa.fa
import atomictest.eq

fun Int.isOdd(): Boolean = !isEven()

fun Int.isEven(): Boolean = this % 2 == 0

fun main() {
  1.isOdd() eq true
  2.isEven() eq true
  13.isEven() eq false
}