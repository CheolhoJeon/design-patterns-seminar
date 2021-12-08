package com.charlie.week2.RemoteController.end;

public class Application {

  public static void main(String ... args) {
    RemoteController controller = new RemoteController();
    controller.pressButton(0);
    controller.pressButton(1);
    controller.pressButton(2);
    controller.undo();
    controller.pressButton(3);
    controller.undo();
  }

}
