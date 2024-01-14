package Practice_Java;

import java.util.Scanner;

public class T_2DArrayMatrix {

    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements");

        for (int i = 0; i < 2; i++) // rows
        {
            for (int j = 0; j < 2; j++) // columns
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Matrix: \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
