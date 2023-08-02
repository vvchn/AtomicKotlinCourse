// Recursion/VerySlowFibonacci.kt
package slowfibonacci
import atomictest.eq
import java.time.*
import java.time.temporal.ChronoUnit

fun fibonacci(n: Long): Long {
  return when (n) {
    0L -> 0
    1L -> 1
    else ->
      fibonacci(n - 1) + fibonacci(n - 2)
  }
}

fun main() {
  fibonacci(0) eq 0
  fibonacci(22) eq 17711
  // Very time-consuming:
  val start = LocalTime.now()
  fibonacci(50) eq 12586269025
  val end = LocalTime.now()
  val diff = Duration.between(start, end)
  println("OK. Finished.")
  println("Total time: ${diff.seconds} sec")
}