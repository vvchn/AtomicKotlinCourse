// Visibility/Task1.kt
package constrainingVisibilityExercise1

class Alien (public val name: String, public val species: String, private var planet: String) {
    override fun toString(): String = "Alien $name, $species: $planet"
    fun movePlanet(planet: String) {
        this.planet = planet
    }
}


fun main() {
  val Arthricia = Alien("Arthricia", "Cat Person", "PurgePlanet")
  val Dale = Alien("Dale", "Giant", "Gearworld")
    println(Arthricia)
    Arthricia.movePlanet("Earth C-137")
    println(Arthricia)
    println(Dale)
    Dale.movePlanet("Parblesnops")
    println(Dale)
}
/* Expected output:
Alien Arthricia, Cat Person: PurgePlanet
Alien Arthricia, Cat Person: Earth C-137
Alien Dale, Giant: Gearworld
Alien Dale, Giant: Parblesnops
*/