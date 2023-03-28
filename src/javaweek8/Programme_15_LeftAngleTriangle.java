package javaweek8;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15_LeftAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int a = sc.nextInt();
        leftTriangle(a);
        sc.close();
    }

    public static void leftTriangle(int x) {
        int i, j;
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
