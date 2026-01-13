package com.fundamentals;
import java.util.*;

public class SumOfTwoNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Addition is: "+Add(a, b));
        System.out.println("Substraction is: "+Sub(a, b));

    }

    public static int Add(int a, int b) {
        return a + b;
    }

    public static int Sub(int a, int b){
        return a-b;
    }

}
