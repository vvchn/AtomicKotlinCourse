// Sequences/Task5.kt
package sequencesExercise5

/* Assume that there must be at least one lesson

return lessons.groupBy { it.students.size }
.maxByOrNull { it.key }
!!.value
.mapTo(mutableSetOf()) { it.instructor }

*/

fun School.instructorsWithLargestClass(): Set<Instructor> {
    val max = lessons.map{ it.students.size }.maxOrNull()
    return lessons.filter { it.students.size == max }
        .mapTo(mutableSetOf()) { it.instructor }
}