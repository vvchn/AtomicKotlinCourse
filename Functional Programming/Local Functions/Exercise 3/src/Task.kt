// LocalFunctions/Task3.kt
package localFunctionsExercise3

import atomictest.eq

fun createContainer(): Pair<(Int) -> Unit, () -> Int?> {
    var container: Int? = null
    fun add(new: Int) {
        container = new
    }

    fun rem(): Int? {
        val res = container
        container = null
        return res
    }

    return Pair(::add, ::rem)
}

fun main() {
    val (add, remove) = createContainer()
    add(42)
    remove() eq 42
    remove() eq null
    add(121)
    remove() eq 121
}