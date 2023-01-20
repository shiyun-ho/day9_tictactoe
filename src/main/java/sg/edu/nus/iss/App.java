package sg.edu.nus.iss;

import java.util.Arrays;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        //board to store the number of items (9 spaces in TTT)
        String[] tttBoard = new String[9];

        //player X and O
        //define a player
        String player = "X";

        //loop: populating the tic tac toe board with 1-9
        for (int i = 0; i < 9; i++){
            //conver to string
            tttBoard[i] = String.valueOf(i+1);
        }

        //to print out the initial tic tac toe board
        //create a separate file with class tictactoe

        //instantiate the tictactoe class
        tictactoe ttt = new tictactoe();

        //prints out the board
        ttt.printBoard(tttBoard);

        System.out.println("Tic-Tac-Toe game");
        System.out.println("----------------");
        System.out.println("X will play first.");

    }

    public String checkWinner(String[] board){
        //to determine if there is a winner
        String line = "";
        String winner = "";

        int i =0;
        while(i<8){
            switch(i){
                case 0: line = board[0] + board[1] + board[2];
                break;
                case 1: line = board[3] + board[4] + board[5];
                break;
                case 2: line = board[6] + board[7] + board[8];
                break;
                case 3: line = board[0] + board[3] + board[6];
                break;
                case 4: line = board[1] + board[4] + board[7];
                break;
                case 5: line = board[2] + board[5] + board[8];
                break;
                case 6: line = board[0] + board[4] + board[8];
                break;
                case 7: line = board[2] + board[4] + board[6];
                break;
            }

            if (line.equals("XXX")){
                winner = "X";
            } else if (line.equalsIgnoreCase("OOO"){
                winner = "O";
                //breaks the loop
                i=9;
            } else {
                for (int a = 0; a<9; a++){
                    //checks array if it contains numeric number 1-9; if yes, break the for loop
                    if (Arrays.asList(board).contains(String.valueOf(a+1))) {
                        break;
                    } else if (a==8) {
                        winner = "draw";
                    }
                }
            }

            i++;
        }
        
        return winner;

    }
}
