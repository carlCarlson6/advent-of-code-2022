package day1

class CaloriesCalculator (rawData: String) {
    private val calories: List<Int> = rawData.split("\n").map { strValue ->
        if(strValue == "") {
            0
        } else {
            strValue.toInt()
        }
    }

    private fun sumCalories(): List<Int> {
        val sumCalories = mutableListOf<Int>()
        var accumulatedValue = 0
        for (calorie in calories) {
            if (calorie == 0) {
                sumCalories.add(accumulatedValue)
                accumulatedValue = 0
            } else {
                accumulatedValue += calorie
            }
        }
        return sumCalories
    }

    fun calculateSumMaxCalories(): Int = sumCalories().maxOrNull()!!

    fun calculateTop3SumCalories(): Int {
        val orderedCalories = sumCalories().sortedDescending()
        return orderedCalories[0]+orderedCalories[1]+orderedCalories[2]
    }
}