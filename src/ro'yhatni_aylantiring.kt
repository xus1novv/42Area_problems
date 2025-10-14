
fun main() {
    val result = rotate(nums= intArrayOf(1,2,3,4,5,6,7), k = 3)
    println(result.joinToString())
}

fun rotate(nums: IntArray, k: Int): IntArray {
    val shift = k % nums.size
    reverse(nums, 0, nums.size-1)
    reverse(nums, 0, shift-1)
    reverse(nums, shift, nums.size - 1)

    return nums
}

fun reverse(nums: IntArray, start: Int, end: Int): IntArray {
    var i = start
    var j = end

    while (i<j) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        i++
        j--
    }

    return nums
}
