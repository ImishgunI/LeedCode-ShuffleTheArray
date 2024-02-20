package org.example

fun main() {
    val nums = intArrayOf(2,5,1,3,4,7)
    val n = 3;
    shuffle(nums, n)
}


fun shuffle(nums: IntArray, n: Int): IntArray {
    var arr: IntArray = IntArray(nums.size)
    for(i in 0 until n){
        arr[i * 2] = nums[i]
        arr[i * 2 + 1] = nums[i + n]
    }
    return arr
}