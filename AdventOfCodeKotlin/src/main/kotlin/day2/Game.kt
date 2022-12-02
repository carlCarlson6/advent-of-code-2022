package day2

class Game(rawData: String) {
    private val rounds: List<GameRound> = rawData
        .split("\n")
        .map { parseGameRound(it) }

    fun calculateTotalScore() = rounds.sumOf { it.calculateScoreWithPlayerAction() }
    fun calculateTotalScoreFromIntendedResults() = rounds.sumOf { it.calculateScoreWithDesiredResult() }
}