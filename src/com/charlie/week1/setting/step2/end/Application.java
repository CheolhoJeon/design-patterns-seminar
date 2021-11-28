package com.charlie.week1.setting.step2.end;

public class Application {

  public static void main(String ... args) {
    Setting settingA = Setting.getInstance();
    Setting settingB = Setting.getInstance();
    System.out.println(settingA == settingB);
  }

}
