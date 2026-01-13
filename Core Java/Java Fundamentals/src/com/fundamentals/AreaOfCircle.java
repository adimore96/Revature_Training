/*
Question 2
Write a program to find the area of a circle.
 */

package com.fundamentals;
import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        float r = sc.nextFloat();
        System.out.println("Area of Circle: "+(3.14*r*r));
    }
}
