package day3

class Rucksack(items: String) {
    private val fistCompartment = items.map { it }.chunked(items.toCharArray().size / 2)[0]
    private val secondCompartment = items.map { it }.chunked(items.toCharArray().size / 2)[1]

    fun calculatePriority(): Int = fistCompartment
        .intersect(secondCompartment)
        .sumOf { calculateElementPriority(it) }
}

fun parse(rawData: String) = rawData.split("\n").map { Rucksack(it) }
fun List<Rucksack>.calculatePriority() = this.sumOf { it.calculatePriority() }