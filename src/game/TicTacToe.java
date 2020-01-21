package game;

/**
 * @author ROSH - 1/20/2020
 */
public class TicTacToe {

  private PlayerMark[][] gameBoard;
  private PlayerMark playerMark;
  private int matrixSize;

  public TicTacToe(PlayerMark[][] initialBoard, int size) {
    gameBoard = initialBoard;
    matrixSize = size;
  }

  public void printGameBoard() {
    for (int i = 0; i < matrixSize; i++) {
      for (int j = 0; j < matrixSize; j++) {
        System.out.print(gameBoard[i][j]);
      }
      System.out.println();
    }
  }

  public void checkWinner() {
    if (checkRowsForWinner() || checkColsForWinner() || checkDiagonalsForWinner()) {
      printGameBoard();
      System.out.println(playerMark + " WON!");
    } else {
      System.out.println("nope");
    }
  }

  private boolean checkDiagonalsForWinner() {
    return (leftToRight() || rightToLeft());
  }

  private boolean rightToLeft() {
    int count = matrixSize;
    int winSize = 0;
    for (int i = 0; i < matrixSize; i++) {
      if (gameBoard[i][count - 1] == gameBoard[0][matrixSize - 1]) {
        winSize++;
      }
      count--;
      if (winSize == matrixSize) {
        playerMark = gameBoard[0][matrixSize - 1];
        return true;
      }
    }
    return false;
  }

  private boolean leftToRight() {
    int winSize = 0;
    for (int i = 0; i < matrixSize; i++) {
      if (gameBoard[i][i] == gameBoard[0][0]) {
        winSize++;
      }
      if (winSize == matrixSize) {
        playerMark = gameBoard[0][0];
        return true;
      }
    }
    return false;
  }

  private boolean checkColsForWinner() {
    for (int i = 0; i < matrixSize; i++) {
      int winSize = 0;
      for (int j = 0; j < matrixSize; j++) {
        if (gameBoard[j][i] == gameBoard[0][i]) {
          winSize++;
        }
      }
      if (winSize == matrixSize) {
        playerMark = gameBoard[0][i];
        return true;
      }
    }
    return false;
  }

  private boolean checkRowsForWinner() {

    for (int i = 0; i < matrixSize; i++) {
      int winSize = 0;
      for (int j = 0; j < matrixSize; j++) {
        if (gameBoard[i][j] == gameBoard[i][0]) {
          winSize++;
        }
      }
      if (winSize == matrixSize) {
        playerMark = gameBoard[i][0];
        return true;
      }
    }
    return false;
  }


}
