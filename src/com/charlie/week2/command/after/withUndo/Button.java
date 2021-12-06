package com.charlie.week2.command.after.withUndo;

import java.util.Stack;

public class Button {

    private Stack<Command> commands = new Stack<>();

    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop().undo();
        }
    }

    public void press(Command command) {
        command.execute();
        commands.push(command);
    }

}
