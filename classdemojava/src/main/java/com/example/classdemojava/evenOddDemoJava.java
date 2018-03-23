package com.example.classdemojava;

/**
 * Created by LENOVO on 23/03/2018.
 */

public class evenOddDemoJava {
    public static void main(String args[]){
        int no;
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=0;i<20;i++)
        {
            no=arr[i];
            if(no%2==0){
                System.out.println(no+"is even no.");
            }else{
                System.out.println(no+"is odd no.");

            }
        }
    }
}
