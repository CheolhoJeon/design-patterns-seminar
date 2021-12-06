package com.charlie.week2.command.after.simple;

import com.charlie.week2.command._01_before.Game;
import com.charlie.week2.command._01_before.Light;

public class Application {

    public static void main(String[] args) {
        Button button = new Button(new LightOnCommand(new Light()));
        button.press();
    }

}
