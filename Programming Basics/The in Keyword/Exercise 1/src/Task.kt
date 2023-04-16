// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
    var str = ""
    for (i in 'a'..'z') {
        str += i
    }
    return str
}

fun main() {
    println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}