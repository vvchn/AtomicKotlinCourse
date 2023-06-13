// Summary2/Task8.kt
package summaryIIExercise8
import atomictest.eq

val romanNumeralToIntMap: Map<String, Int> = mapOf(
  "M" to 1000,
  "CM" to 900,
  "D" to 500,
  "CD" to 400,
  "C" to 100,
  "XC" to 90,
  "L" to 50,
  "XL" to 40,
  "X" to 10,
  "IX" to 9,
  "V" to 5,
  "IV" to 4,
  "I" to 1
)

fun convertFromRoman(roman: String): Int {
  var res = 0
  var max = 0

  for (i in roman.reversed()) {
    if (romanNumeralToIntMap.getValue(i.toString()) >= max) {
      max = romanNumeralToIntMap.getValue(i.toString())
      res += max
    }
    else {
      res -= romanNumeralToIntMap.getValue(i.toString())
    }
  }

  return res
}

fun main() {
  convertFromRoman("XXIII") eq 23
  convertFromRoman("XLIV") eq 44
  convertFromRoman("C") eq 100
  convertFromRoman("MMXVIII") eq 2018
}