package com.charlie.week2.RemoteController.end.invoker;

import com.charlie.week2.RemoteController.end.command.Command;

public class Button {

  private Command command;

  public Button(final Command command) {
    this.command = command;
  }

  public Command press() {
    command.execute();
    return command;
  }

}
