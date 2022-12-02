package day2

import readDayData
import readTestDayData

fun main() {
    executeTest()
    executeChallenge()
}

fun executeTest() {
    println("with test data")
    val data = readTestDayData(1)
    val game = Game(data)
    println("total game score: ${game.calculateTotalScore()}")
    println("total game score: ${game.calculateTotalScoreFromIntendedResults()} - desired")
    println("-------------------------------")
}

fun executeChallenge() {
    println("with read data")
    val data = readDayData(2)
    val game = Game(data)
    println("total game score: ${game.calculateTotalScore()}")
    println("total game score: ${game.calculateTotalScoreFromIntendedResults()} - desired")
    println("-------------------------------")
}