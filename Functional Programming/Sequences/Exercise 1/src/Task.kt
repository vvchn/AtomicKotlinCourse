// Sequences/Task1.kt
package sequencesExercise1

fun School.commonLessons(
    instructor: Instructor,
    student: Student
): Sequence<Lesson> {
    return lessons.filter { it.instructor == instructor && student in it.students}
}

//  return lessons.toList().filter { it.instructor == instructor && student in it.students}.asSequence()