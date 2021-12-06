package com.charlie.week2.command.after.simple;

import com.charlie.week2.command._01_before.Light;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

}
