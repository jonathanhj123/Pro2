public class OPG1 {
    public static void main(String[] args) {
        int [] [] twoDimArray = {
                {0, 4, 3, 9, 6},
                {1, 3, 5, 2, 2},
                {3, 3, 1, 0, 1},
                {0, 0, 9, 7, 1}
        };


        print(twoDimArray);

        System.out.println(sumRow(twoDimArray,0));
        System.out.println(sumColumn(twoDimArray, 0));
        System.out.println(sum(twoDimArray));

    }

    public static void print(int[][] numbers) {
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println(" ");
        }
    }

    public static int sumRow(int[][] numbers, int row) {
        int sum = 0;
        for (int col = 0; col < numbers[row].length; col++) {
            sum += numbers[row][col];
        }
        return  sum;
    }

    public static int sumColumn(int[][] numbers, int col) {
        int sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            sum += numbers[row][col];
        }
        return  sum;
    }

    public static int sum(int[][] numbers) {
        int sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                sum += numbers[row][col];
            }
        }
        return  sum;
    }

    public static int getValueAt(int[][] numbers, int row, int col) {
        return numbers[row][col];
    }

    public static void setValueAt(int[][] numbers, int row, int col, int value) {
        numbers[row][col] = value;
    }

}
