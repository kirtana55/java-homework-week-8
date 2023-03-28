package javaweek8;

import java.util.Scanner;

/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class Programme_12 {
    public static void checkNumber() {
        int a, b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number :");
        a = sc.nextInt();
        sc.close();

        if (a >= 1) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0)
                    b++;
            }
            if (b == 2) {
                System.out.println("Number is PrimeNumber");
            } else {
                System.out.println("Number is not PrimeNumber");
            }
        }
    }

    public static void main(String[] args) {
        checkNumber();
    }
}
