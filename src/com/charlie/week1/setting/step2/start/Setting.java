package com.charlie.week1.setting.step2.start;

public class Setting {

  private static Setting instance;

  private Setting() {

  }

  public static Setting getInstance() {
    if (instance == null) {
      instance = new Setting();
    }
    return instance;
  }

}
