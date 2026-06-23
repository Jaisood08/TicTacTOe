package org.ticktacktoe.strategies.winning;

import org.ticktacktoe.models.Board;
import org.ticktacktoe.models.Move;

public class Diagonal implements WinningStrategies{
    public boolean CheckWinner(Board board, Move move) {
        return  false;
    }
}
