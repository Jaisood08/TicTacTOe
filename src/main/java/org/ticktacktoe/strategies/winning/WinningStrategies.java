package org.ticktacktoe.strategies.winning;

import org.ticktacktoe.models.Board;
import org.ticktacktoe.models.Move;

public interface WinningStrategies {
     boolean CheckWinner(Board board, Move move);
}

