package org.ticktacktoe.controller;
import org.ticktacktoe.models.Game;
import org.ticktacktoe.models.Player;
import org.ticktacktoe.services.GameService;

import java.util.List;

public class GameController {

    GameService gameService;

    public GameController() {
        this.gameService = new GameService();
    }

    public Game startGame(int size, List<Player> players)
    {
        return new Game(size,players);
    }

    public void Display(Game game)
    {
        System.out.println("----------------------------------------------------------");
        gameService.Display(game);
        System.out.println("----------------------------------------------------------");
    }

    public void MakeMove(Game game,int row,int col,Player player)
    {
        gameService.MakeMove(game,row,col,player);
    }
}
