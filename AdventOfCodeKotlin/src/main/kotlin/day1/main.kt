package day1

import readDayData
import readTestDayData

fun main() {
    executeTest()
    executeChallenge()
}

fun executeTest() {
    println("with test data")
    var data = readTestDayData(1)
    var calculator = CaloriesCalculator(data)
    println("max calories: ${calculator.calculateSumMaxCalories()}")
    println("top3 sum: ${calculator.calculateTop3SumCalories()}")
    println("-------------------------------")
}

fun executeChallenge() {
    println("with actual data")
    val data = readDayData(1)
    var calculator = CaloriesCalculator(data)
    println("max calories: ${calculator.calculateSumMaxCalories()}")
    println("top3 sum: ${calculator.calculateTop3SumCalories()}")
    println("-------------------------------")
}

