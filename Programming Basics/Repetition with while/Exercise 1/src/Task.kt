// RepetitionWithWhile/Task1.kt
package repetitionWithWhileExercise1

fun displayContent(s: String) {
    val strLen = s.length
    var i = 0
    while (i < strLen) {
        println(s[i])
        i++
    }
}

fun main() {
    displayContent("abc")
}
/* Expected output:
a
b
c
*/