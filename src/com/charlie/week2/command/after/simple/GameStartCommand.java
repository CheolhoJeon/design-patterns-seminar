package com.charlie.week2.command.after.simple;

import com.charlie.week2.command._01_before.Game;

public class GameStartCommand implements Command {

    private Game game;

    public GameStartCommand(final Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }

}
