import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class OPG3 {
    public static void main(String[] args) {
        double[][] m = new double[4][4];

//        System.out.println(averageMajorDiagonal(m));

        System.out.println("Enter the number of rows and columns of the array: ");
        Scanner scan = new Scanner(System.in);
        double [][] a = new double[scan.nextInt()][scan.nextInt()];

        System.out.println("Enter the array: ");
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = scan.nextDouble();
            }
        }

        System.out.println(Arrays.toString(locateSmallest(a)));;


    }

    public static double averageMajorDiagonal(double[][] m) {
        double sum = 0;
        int count = 0;

        System.out.println("Engter a 4-by-4 matrix row by row: ");
        Scanner scan = new Scanner(System.in);
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                m[row][col] = scan.nextDouble();
                if (row == col) {
                    sum += m[row][col];
                    count++;
                }
            }
        }
        return sum / count;

    }

    public static int[] locateSmallest(double[][] a) {
        int[] Smallest = new int[2];
        double smallest = 999999999;

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] < smallest) {
                    smallest = a[row][col];
                    Smallest[0] = row;
                    Smallest[1] = col;
                }
            }
        }
        return Smallest;
    }
}
