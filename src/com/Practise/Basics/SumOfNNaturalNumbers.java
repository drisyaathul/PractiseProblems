package com.Practise.Basics;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();
        int sum;
//to find Sum of N natural number Using Formula;
        sum = number*(number+1)/2;

        System.out.print("Sum of "+number+" natural numbers are => " +sum);
    }
}
