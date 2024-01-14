package Practice_Java;

import java.util.Scanner;

public class AddingTwoArrays {

    public static void main(String[] args) {

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sum = new int[2][2];
        Scanner r = new Scanner(System.in);

        System.out.println("Enter elements for array A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = r.nextInt();
            }
        }

        System.out.println("Enter elements for array B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                b[i][j] = r.nextInt();
            }
        }

        // Adding the arrays
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Sum of the arrays:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
