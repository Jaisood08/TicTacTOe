package org.ticktacktoe.services;
import org.ticktacktoe.models.Game;
import org.ticktacktoe.models.Move;
import org.ticktacktoe.models.Player;

public class GameService {

    public void Display(Game game)
    {
        game.getBoard().printBoard();
    }

    public void MakeMove(Game game, int row, int col, Player player)
    {
        Move move = new Move(player,row,col);
        game.getMoves().add(move);
        game.getBoard().RegisterMove(move,player);
    }
}
