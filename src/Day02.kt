fun main() {
  fun part1(input: List<String>): Int {
    var depth:Int = 0
    var horizontal:Int = 0 
    
    for (command in input) {
      var (instruction, d) = command.split(' ')
      val distance = d.toInt();

      when(instruction) {
        "forward" -> horizontal += distance
        "up" -> depth -= distance
        "down" -> depth += distance
      }
    }
    return depth * horizontal
  }

  fun part2(input: List<String>): Int {
    var depth:Int = 0
    var horizontal:Int = 0
    var aim:Int = 0

    for(command in input) {
      var (instruction, d) = command.split(' ')
      val distance = d.toInt()

      when (instruction) {
        "down" -> aim += distance
        "up" -> aim -= distance
        "forward" -> {
          horizontal += distance
          depth += aim * distance
        }
      }
    }
    return horizontal * depth
  }

  val input = readInput("Day02")
  println(part1(input))
  println(part2(input))
}
