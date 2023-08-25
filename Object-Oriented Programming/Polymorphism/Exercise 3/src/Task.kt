// Polymorphism/Task3.kt
package polymorphismExercise3
import atomictest.trace
import javax.xml.stream.events.Comment

interface Connection {
    fun send(message: String)
}

class Text : Connection {
    override fun send(message: String) {
        trace("\'$message\' via Text")
    }
}

class Phone : Connection {
    override fun send(message: String) {
        trace("\'$message\' via Phone")
    }
}

class Email : Connection {
    override fun send(message: String) {
        trace("\'$message\' via Email")
    }
}

class Message(val text: String, val connection: Connection) {
    fun transmit() {
        connection.send(text)
    }
}

fun main() {
  listOf(
    Message("We", Text()),
    Message("Are", Phone()),
    Message("Fine", Email())
  ).forEach { it.transmit() }
  trace eq """
    'We' via Text
    'Are' via Phone
    'Fine' via Email
  """
}