// ExpressionsStatements/ForIsAStatement.kt

fun main() {
  // Can't do this:
  // val f = for(i in 1..10) {}
  // Compiler error message:
  // for is not an expression, and
  // only expressions are allowed here
    val test1 = 3
    repeat(if (test1 > 0) 3 else error("gg")) {

    }
    for (i in 'a'..'z') {
        print('g')
    }
}