package day5

class CargoCrane9001(
    stacks: List<Stack>
) : CargoCrane {
    private val stacks: MutableMap<Int, Stack> = stacks.associateBy { it.id }.toMutableMap()
    override fun apply(commands: List<Command>) = commands.forEach{apply(it)}
    override val topCrates: List<String> get() = stacks.map { it.value.crates.last() }
    private fun apply(command: Command) {
        val from = stacks[command.from]
        val cranesToAdd = from!!.pop(command.move)

        val to = stacks[command.to]
        to!!.add(cranesToAdd)

        stacks[command.from] = from
        stacks[command.to] = to
    }
}

fun parseCargoCrane9001(rawData: String): CargoCrane = CargoCrane9001(rawData
    .split("\n")
    .mapIndexed{ index , it ->
        Stack(index+1, it.split(" ").toMutableList())
    })