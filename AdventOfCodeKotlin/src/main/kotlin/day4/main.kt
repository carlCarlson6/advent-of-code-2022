package day4

import readDayData
import readTestDayData

fun main() {
    executeTest()
    executeChallenge()
}

fun executeTest() {
    println("with test data")
    val data = readTestDayData(4)
    var cleaningPairs = parseCleaningPairs(data)
    println("full overlapped pairs ${cleaningPairs.countOverlapping()}")
    println("partial overlapped pairs ${cleaningPairs.countPartialOverlapping()}")
    println("-------------------------------")
}

fun executeChallenge() {
    println("with test data")
    val data = readDayData(4)
    var cleaningPairs = parseCleaningPairs(data)
    println("overlapped pairs ${cleaningPairs.countOverlapping()}")
    println("partial overlapped pairs ${cleaningPairs.countPartialOverlapping()}")
    println("-------------------------------")
}