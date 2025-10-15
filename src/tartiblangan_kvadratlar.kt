
fun main() {
    val response = sortedSquaredArray(intArrayOf(-5,-4,-3,-2,-1,0,1,2))
    println(response.joinToString())
}

fun sortedSquaredArray(array: IntArray): IntArray {
    var index: Int = 0
    for (i in array) {
        array[index] = i*i
        index++
    }
    array.sort()
    return array
}