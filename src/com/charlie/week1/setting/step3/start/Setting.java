package com.charlie.week1.setting.step3.start;

public class Setting {

  private static Setting instance;

  private Setting() {

  }

  public static synchronized Setting getInstance() {
    if (instance == null) {
      instance = new Setting();
    }
    return instance;
  }

}
