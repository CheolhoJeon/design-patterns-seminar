package com.charlie.week2.RemoteController.end.command;

import com.charlie.week2.RemoteController.end.receiver.Game;

public class GameStartCommand implements Command {

  private final Game game;

  public GameStartCommand(final Game game) {
    this.game = game;
  }

  @Override
  public void execute() {
    game.start();
  }

  @Override
  public void undo() {
    game.end();
  }

}
