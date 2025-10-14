

fun main() {
    val result = twoNumberSum(intArrayOf(3, 5, -4, 8, 11, 1, -1, 6), 10)
    println(result.joinToString())
}

fun twoNumberSum(array: IntArray, targetSum: Int): IntArray {
    var a: Int
    for (number in array) {
        a = targetSum - number
        if (a in array && a != number) {
            return if (number > a) intArrayOf(a, number) else intArrayOf(number, a)
        }
    }
    return intArrayOf()
}