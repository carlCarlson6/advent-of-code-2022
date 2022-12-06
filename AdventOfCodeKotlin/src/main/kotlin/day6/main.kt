package day6

import readDayData
import readTestDayData

fun main() {
    executeTest()
    executeChallenge()
}

fun executeTest() {
    println("with test data")
    var dataStreams = readTestDayData(6).split("\n").map { DataStream(it) }
    dataStreams.forEach {
        println("markerStaterIndex ---> ${it.markerStarterIndex}")
        println("messageStarterIndex -> ${it.messageStarterIndex}")
    }
    println("-------------------------------")
}

fun executeChallenge() {
    println("with real data")
    var dataStream = DataStream(readDayData(6))
    println("markerStaterIndex ---> ${dataStream.markerStarterIndex}")
    println("messageStarterIndex -> ${dataStream.messageStarterIndex}")
    println("-------------------------------")
}
