// Interfaces/Hotness.kt
package interfaces
import atomictest.*

interface Hotness {
  fun feedback(): String
}

enum class SpiceLevel : Hotness {
  Mild {
    override fun feedback() =
      "It adds flavor!"
  },
  Medium {
    override fun feedback() =
      "Is it warm in here?"
  },
  Hot {
    override fun feedback() =
      "I'm suddenly sweating a lot."
  },
  Flaming {
    override fun feedback() =
      "I'm in pain. I am suffering."
  }
}

fun main() {
  // Deprecated. Use .entries instead
  // SpiceLevel.entries.map { it.feedback() }
  SpiceLevel.values().map { it.feedback() } eq
    "[It adds flavor!, " +
    "Is it warm in here?, " +
    "I'm suddenly sweating a lot., " +
    "I'm in pain. I am suffering.]"
}