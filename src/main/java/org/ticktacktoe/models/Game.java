package org.ticktacktoe.models;
import org.ticktacktoe.strategies.winning.WinningStrategies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player winner;
    private GameState gameState;
    private List<WinningStrategies> gameWinningStrategies;
    private int nextPlayerIndex;

    private Game(GameBuilder builder)
    {
        this.board = new Board(builder.size);
        this.players = builder.players;
        this.gameWinningStrategies = builder.gameWinningStrategies;
        this.winner = null;
        this.moves = new ArrayList<Move>();
        this.gameState = GameState.ONGOING;
        this.nextPlayerIndex = 0;
        Collections.shuffle(this.players);
    }

    public static class GameBuilder
    {
        private int size;
        private List<Player> players;
        private List<WinningStrategies> gameWinningStrategies;

        public GameBuilder(){
            this.players = new ArrayList<>();
            this.gameWinningStrategies = new ArrayList<>();
        }

        public GameBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public GameBuilder setGameWinningStrategies(List<WinningStrategies> gameWinningStrategies) {
            this.gameWinningStrategies = gameWinningStrategies;
            return this;
        }

        public Game build()
        {
            return new Game(this);
        }
    }


    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public List<WinningStrategies> getGameWinningStrategies() {
        return gameWinningStrategies;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }
}
