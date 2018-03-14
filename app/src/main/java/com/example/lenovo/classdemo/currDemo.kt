package com.example.lenovo.classdemo

/**
 * Created by LENOVO on 14/03/2018.
 */
class ConvertNumToWords {

    var uni= listOf("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen")
    var tens= listOf("", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety")


    fun convert(i:Int): String {

        when {
            i < 20 -> return uni[i]
            else -> {

            }
        }

        when {
            i < 100 -> {
                 return tens[i / 10] + if (i % 10 > 0) {
                    " "
                } else {
                } + convert(i % 10)
            }
            else -> ""
        }
        when {
            i < 1000 ->{
                return uni[i / 100] + " Hundred" + if (i % 100 > 0) {
                    " "
                } else {
                } + convert(i % 100)
            }
            else -> ""
        }

        return if (i < 100000) convert(i / 1000) + " thousand " + (if (i % 1000 > 0) " " + convert(i % 1000) else "")
        else convert(i / 100000) + " lakh " + if (i % 100000 > 0) " " + convert(i % 100000) else ""

    }
}


fun main(args: Array<String>) {
    val a = ConvertNumToWords()
    println(a.convert(155234))
}





