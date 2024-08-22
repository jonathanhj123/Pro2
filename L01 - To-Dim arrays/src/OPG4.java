import java.util.Arrays;

public class OPG4 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(isTicketAvailable(10)));

    }

    private static int[][] TheaterFloor = {
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
            {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
            {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
            {30, 40, 50, 50, 50, 50, 50, 50, 40, 30},
    };


    public static int[] isTicketAvailable(int price) {
        boolean found = false;
        int[] seat = new int[2];
        for (int row = 0; row < TheaterFloor.length; row++) {
            for (int col = 0; col < TheaterFloor[row].length && found == false; col++) {
                if (TheaterFloor[row][col] == price ) {
                    seat[0] = row;
                    seat[1] = col;
                    found = true;
                }
            }
            }
        return seat;
    }
}

