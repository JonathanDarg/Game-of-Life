/*
* represents the game Life
* Input: array size, x, y positions
* Output: game board
*/
public class Life {

    public int [][] gameBoard;

    public Life(int x, int y) {
        gameBoard = new int [y][x];
    }

    /*
    * Initialize a game board
    * @param x
    * @param y
    */
    public void birthCell(int x, int y) {
        if( x >=0 && y >= 0 && x < gameBoard[0].length && y < gameBoard.length){
            gameBoard[y][x] = 1;
        }
    }

    /*
    * checks neighbors and counts to apply rules to the board
    */
    public void advanceTime(){
        int[][] newBoard = new int[gameBoard.length][gameBoard[0].length];

        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[row].length; col++) {
                int count = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (i == 0 && j == 0) continue;
                        int newRow = row + i;
                        int newCol = col + j;
                        if (newRow >= 0 && newRow < gameBoard.length &&
                            newCol >= 0 && newCol < gameBoard[row].length &&
                            gameBoard[newRow][newCol] == 1) {
                            count++;
                        }
                    }
                }

                if (gameBoard[row][col] == 1) {
                    if (count < 2 || count > 3){
                        newBoard[row][col] = 0;
                    } else {
                        newBoard[row][col] = 1;
                    }
                } else {
                    if (count == 3){
                        newBoard[row][col] = 1;
                    } else {
                        newBoard[row][col] = 0;
                    }
                }
            }
        }

        // copy newBoard back to gameBoard
        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[row].length; col++) {
                gameBoard[row][col] = newBoard[row][col];
            }
        }
    }

    /*
    * Prints out the game board line by line with color
    */
    public String toString() {
        final String RESET = "\u001B[0m";
        final String YELLOW = "\u001B[33m";
        final String WHITE = "\u001B[37m";

        StringBuilder display = new StringBuilder();

        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] == 1) {
                    display.append(YELLOW).append("■ ").append(RESET);
                } else {
                    display.append(WHITE).append("□ ").append(RESET);
                }
            }
            display.append("\n");
        }

        return display.toString();
    }
}
