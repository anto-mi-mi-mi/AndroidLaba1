package com.example.androidlaba1

class Strings : Abstractvalues(){


    val text = "The main Canadian islands are Newfoundland, Victorian Island, Baffin Island and others. There are a lot of rivers and lakes in Canada. Among them there are the Great Bear Lake, the Great Slave Lake and the Great Lakes District. The largest rivers are the Nelson, the Ottawa, the Mackenzie and the Yukon."


    val words = text.split(" ").filter{ it.all { it.isLetter() } }
    val decapitalandcount = words.groupingBy {it.first().uppercase()}.eachCount()
    val decapital = words.groupBy{it.first().uppercase()}
    val maxnumber = decapitalandcount.maxByOrNull{ it.value }
    val listofwords = decapital.get(maxnumber?.key)


    override var inputData: String
        get() = text
        set(value) {}

    override var result: Map<String, String>
        get() = mapOf("Список слов " to listofwords.toString(),"\n Самая популярная буква " to maxnumber.toString())
        set(value) {}
}