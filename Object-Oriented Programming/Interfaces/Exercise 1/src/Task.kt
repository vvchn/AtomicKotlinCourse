// Interfaces/Task1.kt
package interfacesExercise1
import atomictest.eq

interface Computer {
  fun calculateAnswer(): Int
}

/*
  private val nodes: List<Node>
init {
  val newList = mutableListOf<Node>()
  for (i in 0 until n) {
    newList += Node(i)
  }
  nodes = newList
}*/

class Cloud(n: Int) : Computer {
  private val nodes = List(n) {
    Node(it)
  }
  override fun calculateAnswer(): Int {
    return nodes.sumOf { it.calculateAnswer() }
  }
}

data class Node(
  private val result: Int
) : Computer {
  override fun calculateAnswer(): Int = result

}

fun main() {
   Cloud(10).calculateAnswer() eq 45
}