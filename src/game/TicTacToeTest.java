package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author ROSH - 1/20/2020
 */
class TicTacToeTest {

  TicTacToe ticTacToe;

  @BeforeEach
  void setUp() {
    ticTacToe = new TicTacToe(new PlayerMark[][]{
        {PlayerMark.O, PlayerMark.O, PlayerMark.X},
        {PlayerMark.O, PlayerMark.O, PlayerMark.X},
        {PlayerMark.X, PlayerMark.X, PlayerMark.O}
    }, 3);
  }

  @Test
  void printGameBoard() {
    ticTacToe.printGameBoard();
  }

  @Test
  void checkWinner() {
    ticTacToe.checkWinner();
  }
}