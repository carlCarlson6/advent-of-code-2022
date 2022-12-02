package day1

import readDayData

fun main() {
    executeTest()
    executeChallenge()
}

fun executeTest() {
    println("with test data")
    val data = "1000\n2000\n3000\n\n4000\n\n5000\n6000\n\n7000\n8000\n9000\n\n1000"
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

