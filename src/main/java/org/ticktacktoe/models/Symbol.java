package org.ticktacktoe.models;

public class Symbol {
    private String symbol;

    public Symbol(String symbol) {
        this.symbol = symbol;
    }

    public void DisplaySymbol() {
        System.out.print(symbol);
    }
}
