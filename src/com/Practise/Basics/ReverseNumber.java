package com.Practise.Basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = scanner.nextInt();
        int reverse = 0;
        int remainder = 0;

        while (number != 0) {
            remainder = number % 10;
            reverse = reverse*10 + remainder;
            number = number / 10;
        }
        System.out.println("Reverse the Number : "+reverse);
    }
}
