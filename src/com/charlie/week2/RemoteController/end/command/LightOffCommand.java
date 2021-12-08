package com.charlie.week2.RemoteController.end.command;

import com.charlie.week2.RemoteController.end.receiver.Light;

public class LightOffCommand implements Command {

  private final Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.off();
  }

  @Override
  public void undo() {
    light.on();
  }

}
