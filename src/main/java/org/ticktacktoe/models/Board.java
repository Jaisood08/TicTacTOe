package org.ticktacktoe.models;
import java.util.ArrayList;
import java.util.List;
import org.ticktacktoe.models.Player;

public class Board {

    private int size;
    private List<List<Cell>> board;

    public Board(int size) {
        this.size = size;
        setBoard();
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard() {
        this.board = new ArrayList<>();
        for(int row=0; row<size; row++) {
            this.board.add(new ArrayList<>());
            for(int col=0; col<size; col++) {
                this.board.get(row).add(new Cell(row,col,CellState.OPEN));
            }
        }
    }


    public void printBoard() {
        for(int row=0; row<size; row++) {
            System.out.print("|");
            for(int col=0; col<size; col++) {
                Player player = this.board.get(row).get(col).getPlayer();
                if(player != null) {
                    player.getSymbol().DisplaySymbol();
                    System.out.print(" ");
                }
                else {
                    System.out.print("  ");
                }
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public void RegisterMove(Move move,Player player)
    {
        this.board.get(move.getRow()).get(move.getCol()).setPlayer(player);
        this.board.get(move.getRow()).get(move.getCol()).setState(CellState.PLAYED);
    }
}
