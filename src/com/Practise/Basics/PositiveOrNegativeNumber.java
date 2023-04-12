package com.Practise.Basics;

import java.util.Scanner;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();
//to check number is Positive or Negative;
        if (number > 0) {
            System.out.println("POSITIVE Number");
        }else if(number < 0)
            System.out.println("NEGATIVE Number");
        else
            System.out.println("ZERO");
    }
}
