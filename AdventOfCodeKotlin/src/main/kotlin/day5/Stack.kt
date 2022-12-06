package day5

class Stack(
    val id: Int,
    var crates: MutableList<String>) {

    fun popReversed(quantity: Int): List<String> = pop(quantity).reversed()
    fun pop(quantity: Int): List<String> {
        val popped = crates
            .toTypedArray()
            .copyOfRange(crates.count()-quantity, crates.count())
            .toMutableList()
        crates = crates.toTypedArray().copyOfRange(0, crates.count()-quantity).toMutableList()
        return popped
    }
    fun add(cratesToAdd: List<String>) = cratesToAdd.forEach { crates.add(it) }
}