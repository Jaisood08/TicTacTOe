package org.ticktacktoe.models;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private int size;
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private Player Winner;
    private GameState gameState;
    private List<GameWinningStrategy> gameWinningStrategies;

    public Game(int size,List<Player> players)
    {
        this.size = size;
        this.board = new Board(size);
        this.players = players;
        this.moves = new ArrayList<Move>();
        this.gameState = GameState.ONGOING;
    }

    public int getSize() {
        return size;
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
        return Winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public List<GameWinningStrategy> getGameWinningStrategies() {
        return gameWinningStrategies;
    }
}
