package com.sarioglutamer.arrayshashing

fun main(){

    val exampleList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    containsDuplicate(exampleList.toIntArray())

}

fun containsDuplicate(nums: IntArray): Boolean{
    if(nums.size < 2){ return false }
    val uniqueSet = HashSet<Int>()
    for(num in nums){
        if(!uniqueSet.add(num)){
            return true
        }
    }
    return false
}