package day4

class CleaningPair(
    private val first: CleaningRange,
    private val second: CleaningRange) {
    val isThereFullOverlap = first.contains(second) || first.isContainedBy(second)
    val isTherePartialOverlap = first.containsPartially(second) || first.isContainedPartially(second)
}

fun List<CleaningPair>.countOverlapping() = this.count { it.isThereFullOverlap }
fun List<CleaningPair>.countPartialOverlapping() = this.count { it.isTherePartialOverlap }

fun parseCleaningPairs(rawData: String): List<CleaningPair> = rawData
    .split("\n")
    .map { it.split(",") }
    .map { CleaningPair(parseCleaningRange(it[0]), parseCleaningRange(it[1])) }