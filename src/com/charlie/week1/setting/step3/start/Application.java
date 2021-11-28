package com.charlie.week1.setting.step3.start;

public class Application {

  public static void main(String ... args) {
    Setting settingA = Setting.getInstance();
    Setting settingB = Setting.getInstance();
    System.out.println(settingA == settingB);
  }

}
