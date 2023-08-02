package com.Practise.Basics;

import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range : ");
        int number = scanner.nextInt();

        String primeNumber = "";

        for (int i=1; i<=number; i++) {
            int count = 0;
            for (int num=i; num>=1; num--) {
                if (i%num == 0){
                    count++;
                }
            }
            if (count == 2) {
                primeNumber = primeNumber+ i +" ";
            }

        }
        System.out.println(primeNumber);
    }
}
