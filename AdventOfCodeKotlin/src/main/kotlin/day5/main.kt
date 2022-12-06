package day5

import readDataFile

fun main() {
    executeTest()
    executeChallenge()
}

fun executeTest() {
    println("with test data")
    val commands = parseCommands(readDataFile("day5-test-data-commands"))
    var cargoCrane = parseCargoCrane9000(readDataFile("day5-test-data-initial"))
    cargoCrane.apply(commands)
    println("to crates as crate mover 9000: ${cargoCrane.topCrates}")
    cargoCrane = parseCargoCrane9001(readDataFile("day5-test-data-initial"))
    cargoCrane.apply(commands)
    println("to crates as crate mover 9001: ${cargoCrane.topCrates}")
    println("-------------------------------")
}

fun executeChallenge() {
    println("with real data")
    val commands = parseCommands(readDataFile("day5-data-commands"))
    var cargoCrane = parseCargoCrane9000(readDataFile("day5-data-initial"))
    cargoCrane.apply(commands)
    println("to crates as crate mover 9000: ${cargoCrane.topCrates}")
    cargoCrane = parseCargoCrane9001(readDataFile("day5-data-initial"))
    cargoCrane.apply(commands)
    println("to crates as crate mover 9001: ${cargoCrane.topCrates}")
    println("-------------------------------")
}