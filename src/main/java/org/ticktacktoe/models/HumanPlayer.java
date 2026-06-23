package org.ticktacktoe.models;

public class HumanPlayer extends Player
{
    public HumanPlayer(String name, Symbol symbol) {
        super(name,PlayerType.HUMAN,symbol);
    }
}
