package day3

fun getAlphabet(): List<Char> {
    var alphabetLowerCase = listOf(
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
        'v', 'w', 'x', 'y', 'z'
    )
    return alphabetLowerCase + alphabetLowerCase.map { it.uppercaseChar() }
}
fun calculateElementPriority(element: Char) = getAlphabet().indexOf(element)+1