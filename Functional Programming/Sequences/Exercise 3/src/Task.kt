// Sequences/Task3.kt
package sequencesExercise3

fun School.averageInstructorRating(instructor: Instructor): Double =
  lessons.filter { instructor == it.instructor }.flatMap { it.rating.values}.average()
// .flatMap { it.rating.values.asSequence() }