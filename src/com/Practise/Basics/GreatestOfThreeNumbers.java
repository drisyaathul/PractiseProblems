package com.Practise.Basics;

import java.util.Scanner;

public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the Second Number : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the Third Number : ");
        int num3 = scanner.nextInt();

        if(num1>num2 && num1>num3)
            System.out.println(num1+" is the Greatest Number");
        else if (num2>num3)
            System.out.println(num2+" is the Greatest Number");
        else
            System.out.println(num3+" is the Greatest Number");

    }
}
