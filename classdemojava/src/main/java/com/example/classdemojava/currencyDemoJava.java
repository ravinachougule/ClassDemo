package com.example.classdemojava;

import java.util.Scanner;

/**
 * Created by LENOVO on 23/03/2018.
 */

public class currencyDemoJava {
   public static final String units[]={"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    public static final String tens[]={"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};


    public static final  String convert(int i){

        if (i < 20) {
            return units[i];
        }
        else{

        }

        if (i < 100) {
            return tens[i / 10] + ((i % 10 != 0) ? " " : "") + units[i % 10];

        }
        if (i < 1000) {
            return units[i / 100] + " Hundred" + ((i % 100 != 0) ? " " : "") + convert(i % 100);

        }
        if(i<100000){
            return convert(i / 1000) + " Thousand" + ((i % 10000 != 0) ? " " : "") + convert(i % 1000);
        }
        if (i < 10000000){
            return convert(i / 100000) + " Lakh" + ((i % 100000 != 0) ? " " : "") + convert(i % 100000);
        }
        return convert(i / 10000000) + " crore " + ((i % 10000000 > 0)? " ":"  ") + convert(i % 10000000);
    }


   public static void main(String args[]){
        String str=convert(1523647);
        System.out.println("No. is"+str);

        int no;
       Scanner sc=new Scanner(System.in);
       no=sc.nextInt();
       System.out.println(convert(no));
   }
}







