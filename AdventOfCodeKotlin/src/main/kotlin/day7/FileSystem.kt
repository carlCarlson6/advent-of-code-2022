package day7

import java.util.function.Predicate

class FileSystem(
    private val directories: List<Directory>
) {

    fun findDirectories(predicate: (Directory) -> Boolean): List<Directory> = directories.filter(predicate)
    fun isSizeAtMost1000000(directoryName: String): Boolean = calculateDirectorySize(directoryName) <= 1000000

    private fun calculateDirectorySize(dirName: String): Int {
        val dir = directories.find { it.name == dirName } ?: return 0
        return dir.files.sumOf { it.size } + dir.childrenDirectories.sumOf { calculateDirectorySize(it) }
    }
}