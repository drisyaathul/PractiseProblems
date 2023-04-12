package com.Practise.Basics;

import java.util.Scanner;

public class EvenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number = scanner.nextInt();
//to check number is Even or Odd;
        if(number%2 == 0)
            System.out.println(number+" is PRIME NUMBER");
        else
            System.out.println(number+" is ODD NUMBER");
    }
}
