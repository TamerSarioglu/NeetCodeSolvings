package com.sarioglutamer.arrayshashing

fun main() {

    val exampleList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(twoSum(exampleList.toIntArray(), 10).contentToString())

}

fun twoSum(nums: IntArray, target: Int): IntArray {
    if (nums.isEmpty()) return intArrayOf()
    val numMap = HashMap<Int, Int>()
    for (i in nums.indices) {
        val theNext = target - nums[i]
        if (theNext in numMap) {
            return intArrayOf(numMap[theNext]!!, i)
        }
        numMap[nums[i]] = i
    }
    throw IllegalArgumentException("Geçerli bir iki toplam çözümü bulunamadı.")
}