package org.ticktacktoe.controller;
import org.ticktacktoe.models.Game;
import org.ticktacktoe.models.GameWinningStrategy;
import org.ticktacktoe.models.Player;
import org.ticktacktoe.services.GameService;
import org.ticktacktoe.strategies.winning.Column;
import org.ticktacktoe.strategies.winning.Diagonal;
import org.ticktacktoe.strategies.winning.Row;
import org.ticktacktoe.strategies.winning.WinningStrategies;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    GameService gameService;

    public GameController() {
        this.gameService = new GameService();
    }

    public Game startGame(int size, List<Player> players)
    {
        List<WinningStrategies> gameWinningStrategies = new ArrayList<>();
        gameWinningStrategies.add(new Row());
        gameWinningStrategies.add(new Column());
        gameWinningStrategies.add(new Diagonal());


        return new Game.GameBuilder()
                .setSize(size)
                .setPlayers(players)
                .setGameWinningStrategies(gameWinningStrategies)
                .build();
    }

    public void Display(Game game)
    {
        System.out.println("----------------------------------------------------------");
        gameService.Display(game);
        System.out.println("----------------------------------------------------------");
    }

    public boolean MakeMove(Game game,int row,int col)
    {
        return gameService.MakeMove(game,row,col);
    }
}
