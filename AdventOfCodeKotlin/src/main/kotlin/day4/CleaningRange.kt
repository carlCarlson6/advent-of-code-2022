package day4

class CleaningRange(
    private val bottomSection: Int,
    private val topSection: Int
) {
    fun contains(range: CleaningRange) = bottomSection <=range.bottomSection && topSection >= range.topSection
    fun isContainedBy(range: CleaningRange) = range.bottomSection <= bottomSection && range.topSection >= topSection
    fun containsPartially(range: CleaningRange) =
        (range.bottomSection in bottomSection..topSection) ||
        (range.topSection in bottomSection..topSection)
    fun isContainedPartially(range: CleaningRange) =
        (bottomSection in range.bottomSection .. range.topSection) ||
        (topSection in range.bottomSection .. range.topSection)
}

fun parseCleaningRange(rawData: String): CleaningRange {
    var split = rawData.split("-").map { it.toInt() }
    return CleaningRange(split[0], split[1])
}