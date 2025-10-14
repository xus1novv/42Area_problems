
fun main() {
    val result = moveZeroes(intArrayOf(0,0,0,0,0,1))
    println(result.joinToString())
}

fun moveZeroes(nums: IntArray): IntArray {
    var indexOfNonZero = 0
    nums.forEachIndexed { index, num ->
        if (num != 0) {
            nums[indexOfNonZero] = nums[index]
            nums[index] = 0
            indexOfNonZero++
        }
    }
    return nums
}