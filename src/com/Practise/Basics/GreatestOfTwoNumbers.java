package com.Practise.Basics;

import java.util.Scanner;

public class GreatestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = scanner.nextInt();
//Greatest of two numbers;
        if (num1>num2)
            System.out.println(num1+" is greater than "+num2);
        else if (num2>num1)
            System.out.println(num2+" is greater than "+num1);
        else
            System.out.println("Both are EQUAL");
    }
}
