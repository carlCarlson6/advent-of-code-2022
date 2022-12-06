package day5

interface CargoCrane {
    fun apply(commands: List<Command>): Unit
    val topCrates: List<String>
}