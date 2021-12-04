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

  fun oxygenGeneratorRating(input: List<String>) : Int {
    var zeroes:List<String> = emptyList();
    var ones:List<String> = emptyList();

    var remaining = input;

    var i:Int = 0
    while (i < input[0].length && remaining.size > 1) {
      for (instruction in remaining) {
        if (instruction.get(i).compareTo('0') == 0) {
          zeroes += instruction
        } else {
          ones += instruction
        }
      }

      if (zeroes.size > ones.size) {
        remaining = zeroes;
      } else {
        remaining = ones;
      }
      i += 1
      zeroes = emptyList()
      ones = emptyList()
    }

    return Integer.parseInt(remaining[0],2);
  }

  fun co2ScrubberRating(input: List<String>):Int {
    var zeroes:List<String> = emptyList();
    var ones:List<String> = emptyList();

    var remaining = input;

    var i:Int = 0
    while (i < input[0].length && remaining.size > 1) {
      for (instruction in remaining) {
        if (instruction.get(i).compareTo('0') == 0) {
          zeroes += instruction
        } else {
          ones += instruction
        }
      }

      if (zeroes.size <= ones.size) {
        remaining = zeroes;
      } else {
        remaining = ones;
      }
      i += 1
      zeroes = emptyList()
      ones = emptyList()
    }

    println(remaining.size)
    return Integer.parseInt(remaining[0],2);  
  }

  fun part2(input: List<String>): Int {
    return oxygenGeneratorRating(input) * co2ScrubberRating(input);
  }

  val input = readInput("Day03")
  println(part1(input))
  println(part2(input))
}
