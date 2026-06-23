package org.ticktacktoe.models;

public class BotPlayer extends Player {
    private DifficultyLevel difficultyLevel;

    public BotPlayer(String name, Symbol symbol,DifficultyLevel difficultyLevel) {
        super(name,PlayerType.BOT,symbol);
        this.difficultyLevel = difficultyLevel;
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }
}
