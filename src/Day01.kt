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
        var increases: Int = 0
        var inc2: Int = 0

        for (i in 2..(input.size - 2)) {
            val l: Int = input.subList(i - 2, i + 1).map { it.toInt() }.toTypedArray().sum()
            val r: Int = input.subList(i - 1, i + 2).map { it.toInt() }.toTypedArray().sum()

            // old, less-idiomatic approach
            // val l: Int = input[i - 2].toInt() + input[i - 1].toInt() + input[i].toInt()
            // val r: Int = input[i - 1].toInt() + input[i].toInt() + input[i + 1].toInt()

            if (r > l) increases += 1
        }
        return increases
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    println(part1(testInput))
    check(part1(testInput) == 3)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
