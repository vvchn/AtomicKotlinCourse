import atomictest.eq

// InKeyword/StringRange.kt

fun main() {
  val c1: UShort = 1u
  val c2: UShort = 10u
  val c3 = c1..c2
  val c4: UByte = 1u
  val c5: UByte = 10u
  val c6 = c4..c5
  val c7: Char = '0'
  val c8: Char = '9'
  val c9 = c8 downTo c7
  val c10 = true
  val c11 = false
  val c12 = false..true
  val c13 = true..false
  val c14 = "fd23re".."f23re23r"
  val c15 = '9' downTo '0'
  val c16 = "abc".."def"
  val c17 = c2..c1
  val c18 = "az".."aa"
  val c19: Double = 1.0
  val c20: Double = 10.0
  val c21 = c20..c19
  val c22: Long = 1
  val c23: Long = 10
  val c24 = c22..c23
  val c25: LongProgression = c22..c23



  println("ab" in "aa".."az")
  println("ba" in "aa".."az")
  println("")
  println(c12.contains(true))
  println(c18.contains("aa"))
  print("\n" + "${c25.forEach(){print(it)}}")
}
/* Output:
true
false
*/