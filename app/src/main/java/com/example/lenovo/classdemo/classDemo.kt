package com.example.lenovo.classdemo

/**
 * Created by LENOVO on 13/03/2018.
 */

//simple class
class A{
    fun m1()
    {
        println("this is simple class")
    }
}

//primary constructor
class B(private var no:Int){
    fun m2(){
        println("Value of no. is $no")
    }
}

//secondary constructor
class C{
    private var name:String="Hello"
    constructor(){
        this.name
        //println("$name")
    }
    fun m(){
        println("$name")
    }
}

open class C1{
    private var name:String="Hi"
    constructor(str:String){
        this.name=str
    }
    fun m(){
        println("$name")
    }
}
//inheritance

open class Child(private var str:String="hi",private var str1:String ): C1(str) {
    fun display(){
        println("$str $str1")
    }
}

//interface
interface Intr1{
    fun show()
}

open class Child2:Intr1{

    override fun show(){
        println("It is an example of implementing interface in child2 class")
    }
}

class Child3(private var str:String,private var str1:String ):Child(str,str1),Intr1{
    override fun show() {
        println("It is an example of implementing interface in child3 class")
        display()
        m()
    }

    fun fun1(vararg string: String){
        for(str in string)
        {
            println(str)
        }
    }
}


fun main(args: Array<String>) {
    var a=A()
    a.m1()

    val b=B(10)
    b.m2()

    val c=C()
    c.m()

    val c1=C1("Hello")
    c1.m()

    val ob=Child("hello",str1 = "Ravina")
    ob.display()
    ob.m()

    val ob1=Child(str1="Ravina")
    ob1.display()

    val obj=Child2()
    obj.show()
    //or
    val obj1: Child2=object : Child2() {
        override fun show() {
            println("Interface method implementation")
        }
    }

    val obj2=Child3("hello",str1 = "friends")
    obj2.show()

    obj2.fun1("one")
    obj2.fun1("one","two","three")
    obj2.fun1()
}