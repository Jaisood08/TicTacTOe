package org.ticktacktoe;
import org.ticktacktoe.controller.GameController;
import org.ticktacktoe.models.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {
        int size = 5;
        List<Player> players = new ArrayList<Player>();
        for(int playerIndex=0;playerIndex<size;playerIndex++)
        {
            char s = (char)('0'+playerIndex);
            String symbol = ""+s;
            players.add(new HumanPlayer("p1",new Symbol(symbol)));
        }

        System.out.println("Welcome to Tic-Tac-Toe!");
        // Start Game
        GameController gamePlayController = new GameController();
        Game game = gamePlayController.startGame(size,players);
        gamePlayController.Display(game);

        // Play Game
        Random rand = new Random();
        int randomMoves = 40;
        int playerIndex = 0;
        while(randomMoves>0)
        {
            int i = rand.nextInt(size);
            int j = rand.nextInt(size);
            boolean check = gamePlayController.MakeMove(game,i,j);
            if(check)
            {
                System.out.print("\n Making Move "+i+" "+j+" For Player : ");
                game.getPlayers().get(playerIndex).getSymbol().DisplaySymbol();
                System.out.println();
                gamePlayController.Display(game);
                playerIndex = game.getNextPlayerIndex();
                randomMoves--;
            }

        }

    }
}
