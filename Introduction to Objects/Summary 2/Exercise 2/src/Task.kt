// Summary2/Task2.kt
package summaryIIExercise2

import atomictest.eq

class Boring2(
    val a: Double = 1.618,
    val b: String = "ratio",
    val c: Int = 11
) {
    fun a () = a
    fun b () = b
    fun c () = c
}

fun main() {
    val boring2 = Boring2()
    boring2.a() eq 1.618
    boring2.b() eq "ratio"
    boring2.c() eq 11
}