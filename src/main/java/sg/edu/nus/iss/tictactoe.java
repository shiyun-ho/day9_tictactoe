package sg.edu.nus.iss;

public class tictactoe {
    //this class to print out the board
    public void printBoard(String[] board){
        //prints the separators
        System.out.println("|-- | --| --|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " | " );
        System.out.println("------------");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " | " );
        System.out.println("------------");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " | " );
        System.out.println("------------");
    }
}
