import kotlin.math.round

fun main() {
  fun part1(input: List<String>): Int {
    val diagnosticCount = input.size
    var totals = IntArray(input[0].length) { 0 }

    for(diagnosticReport in input) {
      for (i in 0..diagnosticReport.length-1) {
        totals[i] += diagnosticReport.get(i).toString().toInt()
      }
    }
    
    var gamma:String = ""

    for(i in 0..totals.size-1) {
      val avg = totals[i].toDouble() / diagnosticCount
      val gammaBit = round(avg).toInt();
      
      gamma += gammaBit.toString()
    }

    val epsilon = (gamma.map { it -> 
      if (it.toString() == "0") {
        1
      } else {
        0
      }
    } ).joinToString("")

    return Integer.parseInt(gamma,2) * Integer.parseInt(epsilon,2)
  }

  fun part2(input: List<String>): Int {
    return input.size
  }

  val input = readInput("Day03")
  println(part1(input))
  println(part2(input))
}
