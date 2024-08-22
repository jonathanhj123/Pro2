import java.awt.font.NumericShaper;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class OPG2 {
    public static void main(String[] args) {
        int [] [] twoDimArray = {
                {0, 4, 3, 9, 6},
                {1, 3, 5, 2, 2},
                {3, 3, 1, 0, 1},
                {0, 0, 9, 7, 1}
        };
        print(twoDimArray);


        allFive(twoDimArray);
        System.out.println(" ");
        print(twoDimArray);

        Rowequal2(twoDimArray);
        System.out.println(" ");
        print(twoDimArray);


        Colequal2(twoDimArray);
        System.out.println(" ");
        print(twoDimArray);


        ChessPattern(twoDimArray);
        System.out.println(" ");
        print(twoDimArray);


        FivePattern(twoDimArray);
        System.out.println( " ");
        print(twoDimArray);



    }

    public static void print(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void allFive(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = 5;
            }
        }
    }

    public static void Rowequal2(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if ((row % 2) == 0) {
                    numbers[row][col] = 2;
                }
                else {
                    numbers[row][col] = 3;
                }
            }
        }
    }

    public static void Colequal2(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length;  col++) {
                if ((col % 2) == 0) {
                    numbers[row][col] = 2;
                }
                else {
                    numbers[row][col] = 3;
                }
            }
        }
    }

    public static void ChessPattern(int[][] numbers) {
        int count = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if ((count % 2) == 0) {
                    numbers[row][col] = 0;
                }
                else {
                    numbers[row][col] = 1;
                }
                count++;
            }
        }
    }


    public static void FivePattern(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (row == 0 || row == numbers.length-1) {
                    numbers[row][col] = 5;
                }
                else if (col == 0 || col == numbers[row].length-1) {
                    numbers[row][col] = 5;
                }
                else {
                    numbers[row][col] = 2;
                }
            }
        }
    }



}
