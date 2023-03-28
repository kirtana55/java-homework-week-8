package javaweek8;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8_Triangle {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int row = sc.nextInt();
        sc.close();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }

    }

}
