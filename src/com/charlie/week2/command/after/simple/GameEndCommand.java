package com.charlie.week2.command.after.simple;

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

}
