// InKeyword/Task4.kt
package theInKeywordExercise4

// isValidCharacter

fun isValidIdentifier(s: String): Boolean {
    //TODO()
    if (s.isEmpty()) return false
    else if ((s.first() !in 'a'..'z') && (s.first() !in 'A'..'Z') && (s.first() != '_')) return false
    else if (s.length == 1) return true
    else {
        for (i in s) { // i in s[1]..s[s.length - 1]
            if ((i !in 'a'..'z') && (i !in 'A'..'Z') && (i != '_') && (i !in '0'..'9')) return false
        }
        return true
    }
}

fun main() {
    println(isValidIdentifier("name"))  // true
    println(isValidIdentifier("0name"))  // false
}