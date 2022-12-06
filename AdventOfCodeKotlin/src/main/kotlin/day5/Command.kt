package day5

class Command(
    val move: Int,
    val from: Int,
    val to: Int)

fun parseCommands(rawData: String) = rawData
    .split("\n")
    .map { parseCommand(it) }

fun parseCommand(rawData: String): Command {
    val cleanedUp = rawData
        .replace("move ", "")
        .replace("from ", "")
        .replace("to ", "")
        .split(" ")
        .map { it.toInt() }
    return Command(cleanedUp[0], cleanedUp[1], cleanedUp[2])
}