package day3

import readDayData
import readTestDayData

fun main() {
    executeTest()
    executeChallenge()
}

fun executeTest() {
    println("with test data")
    val data = readTestDayData(3)
    val sacks = parse(data)
    println("sacks priority: ${sacks.calculatePriority()}")
    val groups = parseGroups(data)
    println("groups priority: ${groups.calculatePriority()}")
    println("-------------------------------")
}

fun executeChallenge() {
    println("with real data")
    val data = readDayData(3)
    val sacks = parse(data)
    println("sacks priority: ${sacks.calculatePriority()}")
    val groups = parseGroups(data)
    println("groups priority: ${groups.calculatePriority()}")
    println("-------------------------------")
}