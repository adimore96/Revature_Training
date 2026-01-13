//Question 5
//Write a program to find the greatest of two numbers.

package com.fundamentals;
import java.util.Scanner;
public class GreatestNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println(a+" is greater");
        }else{
            System.out.println(b+" is greater");
        }
    }
}
