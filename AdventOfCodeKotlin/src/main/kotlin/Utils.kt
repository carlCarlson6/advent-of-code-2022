import java.io.File

fun readDayData(dayNumber: Int): String =
    File("./src/main/kotlin/data/day$dayNumber-data.txt")
        .bufferedReader()
        .use {
            it.readText()
        }

fun readTestDayData(dayNumber: Int): String =
    File("./src/main/kotlin/data/day$dayNumber-test-data.txt")
        .bufferedReader()
        .use {
            it.readText()
        }