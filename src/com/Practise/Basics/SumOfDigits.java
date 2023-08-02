package com.Practise.Basics;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Digits: ");
        int digits = scanner.nextInt();
        int sum = 0;
        int remainder = 0;

        while (digits != 0){
            remainder = digits % 10;
            sum += remainder;
            digits = digits / 10;
        }
        System.out.println("Sum of Digits : "+sum);
    }
}
