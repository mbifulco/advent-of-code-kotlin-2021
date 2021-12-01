fun main() {
    fun part1(input: List<String>): Int {
        var prev: Int? = null
        var increases: Int = 0

        for (d in input) {
            val depth: Int = d.toInt()
            if (prev != null) {
                if (depth > prev) increases += 1
            }
            prev = depth
        }
        return increases
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    println(part1(testInput))
    check(part1(testInput) == 3)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
