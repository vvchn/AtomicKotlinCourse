// Summary2/Task4.kt
package summaryIIExercise4

import atomictest.capture
import atomictest.eq

class Dictionary() {
    val _translations = mutableMapOf<String, List<String>>()

    val translations: Map<String, List<String>>
        get() = _translations

    fun addTranslations(word: String, translations: String) {
        if(_translations[word] == null) {
            _translations += word to translations.split(" ")
        }
        else {
            throw IllegalArgumentException("Dictionary already has translations for '$word'")
        }
    }
}

fun main() {
      val dictionary = Dictionary()
      dictionary.addTranslations("apple", "Apfel")
      dictionary.addTranslations("cake", "Kuchen Torte")

      dictionary.translations eq mapOf("apple" to listOf("Apfel"),
        "cake" to listOf("Kuchen", "Torte"))

      capture {
        dictionary.addTranslations("cake", "Törtchen")
      } eq "IllegalArgumentException: Dictionary already has translations for 'cake'"

    // shouldn't compile:
//  dictionary.translations.remove("apple")
}