package org.ticktacktoe.models;

public class Cell {

    private int row;
    private int col;
    private CellState state;
    private Player player;

    public Cell(int row, int col, CellState state) {
        this.row = row;
        this.col = col;
        this.state = state;
    }

    public void setState(CellState state) {
        this.state = state;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Integer getRow() {
        return row;
    }

    public Integer getCol() {
        return col;
    }

    public CellState getState() {
        return state;
    }

    public Player getPlayer() {
        return player;
    }
}
