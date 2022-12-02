package day2

data class GameRound(
    val enemyAction: GameAction,
    val playerAction: GameAction,
    val playerIntendedResult: GameActionResult
) {
    fun calculateScoreWithPlayerAction() = playerAction.points + playerAction.against(enemyAction).points
    fun calculateScoreWithDesiredResult() = playerIntendedResult.against(enemyAction).points + playerIntendedResult.points
}

fun parseGameRound(input: String) : GameRound {
    val split = input.split(" ")
    return GameRound(
        enemyAction = parseGameAction(split[0]),
        playerAction = parseGameAction(split[1]),
        playerIntendedResult = parseGameActionResult(split[1])
    )
}