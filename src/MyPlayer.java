import java.awt.*;
import java.util.ArrayList;

public class MyPlayer {
    public Chip[][] gameBoard;
    public int[] columns;
    public ArrayList<Board> winningBoards = new ArrayList<>();
    public ArrayList<Board> loosingBoards = new ArrayList<>();

    public MyPlayer() {
        columns = new int[10];

        loosingBoards.add(new Board(1,0,0));
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
        boolean foundIJKWinner = false;

        for (int x = k-1; x >= 0; x --){
            System.out.println(i + " " + j + " " + x + ": (" + x + ", 2)");
        }

        for (int x = j - 1; x >= 0; x--) {
            if(x>=k){
                System.out.println(i + " " + x + " " + k + ": (" + x + ", 1)");
                for (int n = 0; n < loosingBoards.size(); n++) {
                    if (i == loosingBoards.get(0).cols[0] && x == loosingBoards.get(n).cols[1] && k == loosingBoards.get(n).cols[2]) {
                        foundIJKWinner = true;
                        System.out.println("Winner winner chicken dinner");
                    }
                }
            } else {
                System.out.println(i + " " + x + " " + x + ": (" + x + ", 1)");
            }
        }

        for (int x = i - 1; x >0; x--){
            if (x>j && x>k) {
                System.out.println(x + " " + j + " " + k + ": (" + x + ", 0)");
            } else if (x>k){
                System.out.println(x + " " + x + " " + k + ": (" + x + ", 0)");
            } else {
                System.out.println(x + " " + x + " " + x + ": (" + x + ", 0)");
            }
        }

        if(foundIJKWinner == true){
            winningBoards.add(new Board(i, j, k));
        }else{
            loosingBoards.add(new Board(i, j, k));
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
