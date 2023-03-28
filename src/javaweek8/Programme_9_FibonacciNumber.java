package javaweek8;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Programme_9_FibonacciNumber {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Fibonacci number sequence: ");
        myMethod(sc.nextInt());
        //closing the scanner
        sc.close();

    }

    public static void myMethod(int sequence) {
        int k1 = 0, k2 = 1, k3;
        System.out.print(k1 + " " + k2);
        for (int i = 2; i < sequence; ++i) {
            k3 = k1 + k2;
            System.out.print(" " + k3);
            k1 = k2;
            k2 = k3;
        }
    }
}