package com.charlie.week2.command.after.simple;

public class Button {

    private Command command;

    public Button(final Command command) {
        this.command = command;
    }

    public void press() {
        command.execute();
    }

}
