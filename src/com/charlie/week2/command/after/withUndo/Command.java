package com.charlie.week2.command.after.withUndo;

public interface Command {
    void execute();
    void undo();
}
