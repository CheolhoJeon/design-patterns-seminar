package com.charlie.week2.RemoteController.end.command;

public interface Command {
  void execute();
  void undo();
}
