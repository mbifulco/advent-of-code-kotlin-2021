# advent-of-code-kotlin-2021

Welcome to the Advent of Code[^aoc] Kotlin project created by [mbifulco][github] using the [Advent of Code Kotlin Template][template] delivered by JetBrains.

In this repository, mbifulco is about to provide solutions for the puzzles using [Kotlin][kotlin] language.

If you're stuck with Kotlin-specific questions or anything related to this template, check out the following resources:

- [Kotlin docs][docs]
- [Kotlin Slack][slack]
- Template [issue tracker][issues]

## To run the code for a given day's challenge

1. make sure you've got the Kotlin CLI and it's dependencies installed
2. from the root directory for this repo, run `kotlinc src/Day02.kt src/Utils.kt -include-runtime -d build/Day02.jar && java -jar build/Day02.jar` (this will compile Day02.kt and Utils.kt only, and pacakage them as a jar in build/Day02.jar, and then run that with a Java command)

[^aoc]:
    [Advent of Code][aoc] – An annual event of Christmas-oriented programming challenges started December 2015.
    Every year since then, beginning on the first day of December, a programming puzzle is published every day for twenty-four days.
    You can solve the puzzle and provide an answer using the language of your choice.

[aoc]: https://adventofcode.com
[docs]: https://kotlinlang.org/docs/home.html
[github]: https://github.com/mbifulco
[issues]: https://github.com/kotlin-hands-on/advent-of-code-kotlin-template/issues
[kotlin]: https://kotlinlang.org
[slack]: https://surveys.jetbrains.com/s3/kotlin-slack-sign-up
[template]: https://github.com/kotlin-hands-on/advent-of-code-kotlin-template
