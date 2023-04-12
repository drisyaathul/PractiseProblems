package com.Practise.Basics;

import java.util.Scanner;

public class SumOfFirstNNaturalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();
//to find Sum of first N natural number Using Loop;
        int sum = 0;
        for (int i=1; i<=number; i++) {
            sum = sum + i;
        }
        System.out.print("Sum of first "+number+" natural numbers are => " +sum);
    }
}
