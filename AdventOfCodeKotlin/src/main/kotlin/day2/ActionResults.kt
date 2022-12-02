package day2

interface GameActionResult {
    val points: Int
    val name: String
    fun against(gameAction: GameAction): GameAction
}

class Win : GameActionResult {
    override val points = 6
    override val name   = "WIN"

    override fun against(gameAction: GameAction) = when(gameAction.name) {
        Rock().name     -> Paper()
        Paper().name    -> Scissors()
        Scissors().name -> Rock()
        else            -> throw Error("invalid input")
    }
}

class Loss : GameActionResult {
    override val points = 0
    override val name   = "LOSS"

    override fun against(gameAction: GameAction) = when(gameAction.name) {
        Rock().name     -> Scissors()
        Paper().name    -> Rock()
        Scissors().name -> Paper()
        else            -> throw Error("invalid input")
    }
}

class Draw : GameActionResult {
    override val points = 3
    override val name   = "DRAW"
    
    override fun against(gameAction: GameAction) = when(gameAction.name) {
        Rock().name     -> Rock()
        Paper().name    -> Paper()
        Scissors().name -> Scissors()
        else            -> throw Error("invalid input")
    }

}

fun parseGameActionResult(input: String) = when(input) {
    "X" -> Loss()
    "Y" -> Draw()
    "Z" -> Win()
    else -> throw Error("invalid input")
}