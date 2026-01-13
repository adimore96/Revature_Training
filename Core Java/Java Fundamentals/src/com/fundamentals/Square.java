//Question 4
//Write a program to find the square of a number.

package com.fundamentals;
public class Square {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Square is: "+getSquare(num));
    }

    static int getSquare(int num){
        return (num*num);
    }
}
