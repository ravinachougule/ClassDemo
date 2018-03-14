package com.example.lenovo.classdemo

/**
 * Created by LENOVO on 14/03/2018.
 */
fun main(args:Array<String>){
    var no:IntArray=intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)

    for(i in no){
        if(i%2==0)
        {
            println("$i is even no")
        }
        else
        {
            println("$i is odd no")
        }
    }
}


