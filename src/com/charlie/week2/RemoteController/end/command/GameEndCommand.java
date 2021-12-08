package com.charlie.week2.RemoteController.end.command;

import com.charlie.week2.RemoteController.end.receiver.Game;

public class GameEndCommand implements Command {

  private final Game game;

  public GameEndCommand(final Game game) {
    this.game = game;
  }

  @Override
  public void execute() {
    game.end();
  }

  @Override
  public void undo() {
    game.start();
  }

}
