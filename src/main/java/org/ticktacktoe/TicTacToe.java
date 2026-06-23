package org.ticktacktoe;
import org.ticktacktoe.controller.GameController;
import org.ticktacktoe.models.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {
        int size = 3;
        Player p1 = new HumanPlayer("p1",new Symbol("X"));
        Player p2 = new BotPlayer("p2",new Symbol("O"),DifficultyLevel.EASY);
        List<Player> players = new ArrayList<Player>();
        players.add(p1);
        players.add(p2);
        System.out.println("Welcome to Tic-Tac-Toe!");
        GameController gamePlayController = new GameController();
        Game game = gamePlayController.startGame(size,players);
        gamePlayController.Display(game);
        Random rand = new Random();
        int randomMoves = 5;
        int player = 0;
        while(randomMoves>0)
        {
            int i = rand.nextInt(size);
            int j = rand.nextInt(size);
            gamePlayController.MakeMove(game,i,j,players.get(player));
            gamePlayController.Display(game);
            randomMoves--;
            player=(player+1) % players.size();
        }

    }
}
