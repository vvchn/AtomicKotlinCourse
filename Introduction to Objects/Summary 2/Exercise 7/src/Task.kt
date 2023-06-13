// Summary2/Task7.kt
package summaryIIExercise7

import atomictest.eq

val intToRomanNumeralMap: Map<Int, String> = mapOf(
    1000 to "M",
    900 to "CM",
    500 to "D",
    400 to "CD",
    100 to "C",
    90 to "XC",
    50 to "L",
    40 to "XL",
    10 to "X",
    9 to "IX",
    5 to "V",
    4 to "IV",
    1 to "I"
)

fun convertToRoman(number: Int): String {
    if (intToRomanNumeralMap.contains(number)) return intToRomanNumeralMap.getValue(number)
    var result = ""
    var temp = number

    while (temp > 0) {
        for (i in intToRomanNumeralMap) {
            if (temp - i.key >= 0) {
                result += i.value
                temp -= i.key
                break
            }
        }
    }

    return result
}

fun main() {
    convertToRoman(23) eq "XXIII"
    convertToRoman(44) eq "XLIV"
    convertToRoman(100) eq "C"
    convertToRoman(2018) eq "MMXVIII"
}