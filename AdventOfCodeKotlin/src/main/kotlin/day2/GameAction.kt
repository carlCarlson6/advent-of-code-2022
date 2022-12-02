package day2

interface GameAction {
    val points: Int
    val name: String
    fun against(gameAction: GameAction): GameActionResult
}

class Rock : GameAction {
    override val points = 1
    override val name   = "ROCK"

    override fun against(gameAction: GameAction) = when(Pair(this.name, gameAction.name)) {
        Pair(this.name, this.name)       -> Draw()
        Pair(this.name, Paper().name)    -> Loss()
        Pair(this.name, Scissors().name) -> Win()
        else                             -> throw Error("invalid input")
    }
}

class Paper : GameAction {
    override val points = 2
    override val name   = "PAPER"

    override fun against(gameAction: GameAction) = when(Pair(this.name, gameAction.name)) {
        Pair(this.name, Rock().name)     -> Win()
        Pair(this.name, this.name)       -> Draw()
        Pair(this.name, Scissors().name) -> Loss()
        else                             -> throw Error("invalid input")
    }
}

class Scissors : GameAction {
    override val points = 3
    override val name   = "SCISSORS"
    override fun against(gameAction: GameAction) = when(Pair(this.name, gameAction.name)) {
        Pair(this.name, Rock().name)  -> Loss()
        Pair(this.name, Paper().name) -> Win()
        Pair(this.name, this.name)    -> Draw()
        else                          -> throw Error("invalid input")
    }
}

fun parseGameAction(input: String): GameAction = when (input) {
    "A" -> Rock()
    "B" -> Paper()
    "C" -> Scissors()
    "X" -> Rock()
    "Y" -> Paper()
    "Z" -> Scissors()
    else -> throw Error("invalid input")
}