package day6

class DataStream(
    private val rawDataStream: String) {
    val length get() = rawDataStream.length
    val markerStarterIndex get() = findMarkerStaterIndex()
    val messageStarterIndex get() = findMessageStarterIndex()
    private fun findMarkerStaterIndex(): Int {
        for (index in rawDataStream.toCharArray().indices) {
            var streamSection = rawDataStream.toCharArray().copyOfRange(index, index+4).toTypedArray()
            if (!hasDuplicates(streamSection))
                return index+4
        }
        return -1
    }
    private fun findMessageStarterIndex(): Int {
        for (index in rawDataStream.toCharArray().indices) {
            val searchIndex = index+markerStarterIndex
            var streamSection = rawDataStream.toCharArray().copyOfRange(searchIndex, searchIndex+14).toTypedArray()
            if (!hasDuplicates(streamSection))
                return searchIndex+14
        }
        return -1
    }


    private fun <T> hasDuplicates(arr: Array<T>): Boolean {
        return arr.size != arr.distinct().count();
    }
}