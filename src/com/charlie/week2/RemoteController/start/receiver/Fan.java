package com.charlie.week2.RemoteController.start.receiver;

public class Fan {

  private Speed speed = Speed.OFF;

  public enum Speed {
    HIGH, MEDIUM, LOW, OFF
  }

  public void high() {
    speed = Speed.HIGH;
    System.out.println("속도를 '강'으로 변경합니다.");
  }

  public void medium() {
    speed = Speed.MEDIUM;
    System.out.println("속도를 '중'으로 변경합니다.");
  }

  public void low() {
    speed = Speed.LOW;
    System.out.println("속도를 '약'으로 변경합니다.");
  }

  public void off() {
    speed = Speed.OFF;
    System.out.println("선풍기를 끕니다.");
  }

  public Speed getSpeed() {
    return speed;
  }

}
