package com.example.classdemojava;

/**
 * Created by LENOVO on 23/03/2018.
 */
//Simple class
class c{
    void fun(){
        System.out.println("This  is a simple class");
    }
}

//Constructor


class c1{
    //Default Constructor
    c1(){
        System.out.println("This is default constructor");
    }
    //parameterised constructor
    c1(String str){
        System.out.println("This is parameterised constructor");
        System.out.println("Value of string is:"+str);
    }
    void Display(){
        System.out.println("This is display method in class c1");
    }
}

//inheritance
class c2 extends c1{
    void  show(){
        System.out.println("this is show method in c2 class");
        super.Display();
    }
    //overiding
    void Display(){
        System.out.println("This is display method in class c2");
    }
}

//Inteface
interface i1{
    int cal(int a,int b);
}
class c3 implements i1{
    int c=10;
    @Override
    public int cal(int a, int b) {
        return a+b+c;
    }
    public int multi(int no){
        return c*no;
    }
}
class c4 extends c3 implements i1{
     public int cal(int a,int b){
         return a*b;
     }
}

public class classDemo {
    public static void main(String args[]){
            c ob=new c();
            ob.fun();

            c1 ob1=new c1();
            c1 ob2=new c1("hello");
            ob1.Display();

            c2 ob3=new c2();
            ob3.show();
            ob3.Display();

            c3 ob4=new c3();
            ob4.cal(15,25);
            ob4.multi(30);

            c4 ob5=new c4();
            ob5.cal(50,60);
            ob5.multi(12);


    }
}
