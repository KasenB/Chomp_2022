import java.awt.*;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;

    public MyPlayer() {
        columns = new int[10];

        /***
         * This code will run just once, when the game opens.
         * Add your code here.
         */
        //here
        for (int i = 1; i < 4; i++){
            for (int j = 0; j <= i; j ++) {
                for (int k = 0; k <= j; k++) {
                    System.out.println("Regular board: " + i + " " + j + " " + k);
                    oneMoveAway(i,j,k);
                }
            }
        }
    }

    public void oneMoveAway(int i, int j, int k) {
        // for each ijk board, print all boards that result after a single move

        for (int x = k-1; x >= 0; x --){
            System.out.println(i + " " + j + " " + x);
        }

        for (int x = j - 1; x >= 0; x--) {
            if(x>=k){
                System.out.println(i + " " + x + " " + k);

            } else {
                System.out.println(i + " " + x + " " + x);
            }
        }

    }


    public Point move(Chip[][] pBoard) {

        System.out.println("MyPlayer Move");

        gameBoard = pBoard;
        int column = 0;
        int row = 0;

        row = 1;
        column = 1;

        /***
         * This code will run each time the "MyPlayer" button is pressed.
         * Add your code to return the row and the column of the chip you want to take.
         * You'll be returning a data type called Point which consists of two integers.
         */

        Point myMove = new Point(row, column);
        return myMove;
    }

}
