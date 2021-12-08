package com.charlie.week2.RemoteController.end;

import com.charlie.week2.RemoteController.end.command.Command;
import com.charlie.week2.RemoteController.end.command.GameEndCommand;
import com.charlie.week2.RemoteController.end.command.GameStartCommand;
import com.charlie.week2.RemoteController.end.command.LightOffCommand;
import com.charlie.week2.RemoteController.end.command.LightOnCommand;
import com.charlie.week2.RemoteController.end.invoker.Button;
import com.charlie.week2.RemoteController.end.receiver.Game;
import com.charlie.week2.RemoteController.end.receiver.Light;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoteController {

  private Stack<Command> commands = new Stack<>();
  private List<Button> buttons;

  public RemoteController() {
    buttons = new ArrayList<>();
    buttons.add(new Button(new LightOnCommand(new Light())));
    buttons.add(new Button(new LightOffCommand(new Light())));
    buttons.add(new Button(new GameStartCommand(new Game())));
    buttons.add(new Button(new GameEndCommand(new Game())));
  }

  public void pressButton(int buttonNumber) {
    commands.push(buttons.get(buttonNumber).press());
  }

  public void undo() {
    if (commands.isEmpty()) return;
    commands.pop().undo();
  }

}
