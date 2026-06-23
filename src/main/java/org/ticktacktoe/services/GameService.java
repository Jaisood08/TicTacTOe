package org.ticktacktoe.services;
import org.ticktacktoe.models.*;

import java.util.List;

public class GameService {

    public void Display(Game game)
    {
        game.getBoard().printBoard();
    }

    public boolean MakeMove(Game game, int row, int col)
    {
        Board gameBoard = game.getBoard();
        int boardSize = gameBoard.getSize();

        List<List<Cell>> board = gameBoard.getBoard();
        if(row>=0 && row<boardSize && col>=0 && col<boardSize && board.get(row).get(col).getState()==CellState.OPEN)
        {
            int currentPlayerIndex = game.getNextPlayerIndex();
            Player player = game.getPlayers().get(currentPlayerIndex);
            Move move = new Move(player,row,col);
            game.getMoves().add(move);
            game.getBoard().RegisterMove(move,player);
            int size = game.getPlayers().size();
            game.setNextPlayerIndex( (currentPlayerIndex+1) % size);
        }
        else
        {
            return false;
        }
        return true;
    }
}
