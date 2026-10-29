package com.sarioglutamer.groupanagrams

fun main() {

    val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    val result = groupAnagrams(strs)
    println(result)

}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val anagramGroups = mutableMapOf<String, MutableList<String>>()

    for (str in strs) {
        val sortedStr = str.toCharArray().sorted().toString()
        anagramGroups.getOrPut(sortedStr) { mutableListOf() }.add(str)
    }

    return anagramGroups.values.toList()
}