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
        if( x >=0 && y >= 0){
            gameBoard[x][y] = 1;
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
                //neighbors and bounds of board
                if (row - 1 >= 0 && col - 1 >= 0 && gameBoard[row - 1][col - 1] == 1) {
                    count++;
                }
                if (row - 1 >= 0 && gameBoard[row - 1][col] == 1) {
                    count++;
                }
                if (row - 1 >= 0 && col + 1 < gameBoard[row].length && gameBoard[row - 1][col + 1] == 1) {
                    count++;
                }
                if (col - 1 >= 0 && gameBoard[row][col - 1] == 1) {
                    count++;
                }
                if (col + 1 < gameBoard[row].length && gameBoard[row][col + 1] == 1) {
                    count++;
                }
                if (row + 1 < gameBoard.length && col - 1 >= 0 && gameBoard[row + 1][col - 1] == 1) {
                    count++;
                }
                if (row + 1 < gameBoard.length && gameBoard[row + 1][col] == 1) {
                    count++;
                }
                if (row + 1 < gameBoard.length && col + 1 < gameBoard[row].length && gameBoard[row + 1][col + 1] == 1) {
                    count++;
                }

                //living cells rules 1-3
                if (gameBoard[row][col] == 1) {
                    if (count < 2){
                        newBoard[row][col] = 0;
                    } else if (count == 2 || count == 3){
                        newBoard[row][col] = 1;
                    } else{
                        newBoard[row][col] = 0;
                    }
                //dead cell rule 4
                } else {
                    if (count == 3){
                        newBoard[row][col] = 1;
                    } else{
                        newBoard[row][col] = 0;
                    }
                }
            }
    }
    //copies new board to game board
    for (int row = 0; row < gameBoard.length; row++) {
        for (int col = 0; col < gameBoard[row].length; col++) {
            gameBoard[row][col] = newBoard[row][col];
        }
    }

}

/*
* Prints out the game board line by line with /n
* @return returnString
*/
public String toString() {
    String display = "";
    for (int i = 0; i < gameBoard.length; i++) {
        for (int j = 0; j < gameBoard[i].length; j++) {
            display += gameBoard[i][j] + " ";
        }
        display += "\n";
    }
    return display;
    }
}