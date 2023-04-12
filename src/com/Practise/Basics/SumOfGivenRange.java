package com.Practise.Basics;
//Sum of numbers in a given range;
public class SumOfGivenRange {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 8;
        int sum = 0;
        for (int i=num1; i<=num2; i++) {
            sum = sum + i;
        }
        System.out.print("Sum of the given range => "+sum);
    }
}
