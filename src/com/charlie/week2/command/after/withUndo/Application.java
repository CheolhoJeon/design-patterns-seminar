package com.charlie.week2.command.after.withUndo;

import com.charlie.week2.command._01_before.Game;
import com.charlie.week2.command._01_before.Light;

public class Application {

    public static void main(String[] args) {
        Button button = new Button();
        button.press(new LightOnCommand(new Light()));
        button.press(new GameStartCommand(new Game()));
        button.undo();
        button.undo();
    }

}
