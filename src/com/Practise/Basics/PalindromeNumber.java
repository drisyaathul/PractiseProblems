package com.Practise.Basics;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = scanner.nextInt();
        int remainder = 0;
        int reverse = 0;
        int temp = number;

        while (temp != 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
        if (number == reverse) {
            System.out.println(number+ " is a Palindrome.");
        }else
            System.out.println(number+ " ia not a Palindrome.");
    }
}
