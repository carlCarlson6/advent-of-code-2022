import java.io.File

fun readDayData(dayNumber: Int) = readDataFile("day$dayNumber-data")

fun readTestDayData(dayNumber: Int) = readDataFile("day$dayNumber-test-data")

fun readDataFile(fileName: String) = File("./src/main/kotlin/data/$fileName.txt")
    .bufferedReader()
    .use {
        it.readText()
    }