// DataClasses/Task1.kt
package dataClassesExercise1

data class AirlineTicket(
    var firstName: String,
    var lastName: String,
    var ticket: Int,
    var origin: String,
    var destination: String
)

fun main() {
      val ticket = AirlineTicket("Bruce", "Eckel",
        123456, "DEN", "HND")
      println(ticket)
}
/* Expected output:
AirlineTicket(firstName=Bruce, lastName=Eckel, ticket=123456, origin=DEN, destination=HND)
*/