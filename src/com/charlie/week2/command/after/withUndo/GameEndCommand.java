package com.charlie.week2.command.after.withUndo;

import com.charlie.week2.command._01_before.Game;

public class GameEndCommand implements Command {

    private Game game;

    public GameEndCommand(final Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.end();
    }

    @Override
    public void undo() {
        new GameStartCommand(this.game).execute();
    }

}
