package org.ticktacktoe.models;

public class Move {
    private int row;
    private int col;
    private Player Player;

    public Move(Player player, int row, int col) {
        Player = player;
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Player getPlayer() {
        return Player;
    }
}
