// SafeCallsAndElvis/Task3.kt
package safeCallsAndTheElvisOperatorExercise3

data class Client(
  val name: String,
  val personalInfo: PersonalInfo? = null)

data class PersonalInfo(
  val email: String? = null,
  val address: Address? = null)

data class Address(
  val country: String? = null,
  val city: String? = null,
  val street: String? = null)

fun String?.check() = this ?: "Unspecified"

fun Client.fullInfo(): String = "name: ${this.name}\n" + ("email: ${this.personalInfo?.email.check()}\n") +
        ("country: ${this.personalInfo?.address?.country.check()}\n") +
        ("city: ${this.personalInfo?.address?.city.check()}\n") +
        ("street: ${this.personalInfo?.address?.street.check()}")

fun main() {
  val alice = Client("Alice",
    PersonalInfo(
      email = "alice@gmail.com",
      address = Address("Germany", "Munich")))
  println(alice.fullInfo())
  println("---")
  println(Client("Bob").fullInfo())
}
/* Output:
name: Alice
email: alice@gmail.com
country: Germany
city: Munich
street: Unspecified
---
name: Bob
email: Unspecified
country: Unspecified
city: Unspecified
street: Unspecified
*/