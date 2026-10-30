package com.sarioglutamer.arrayshashing

fun main() {

    val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val result = groupAnagrams(strs)
    println(result)

}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val anagramGroups = mutableMapOf<String, MutableList<String>>()

    for (i in strs) {
        val sortedStr = i.toCharArray().sorted().toString()
        anagramGroups.getOrPut(sortedStr) { mutableListOf() }.add(i)
    }

    return anagramGroups.values.toList()
}