package day3

class Group(
    private val firstItems: String,
    private val secondItems: String,
    private val thirdItems: String
) {
    fun calculatePriority() = calculateElementPriority(findIdentityElement())
    private fun findIdentityElement(): Char = firstItems.map { it }
        .intersect(secondItems.map { it })
        .intersect(thirdItems.map { it })
        .first()
}

fun parseGroups(rawData: String): List<Group> = rawData
    .split("\n")
    .chunked(3)
    .map { Group(it[0], it[1], it[2]) }

fun List<Group>.calculatePriority() = this.sumOf { it.calculatePriority() }