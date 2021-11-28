package com.charlie.week1.setting.step4.start;

public class Setting {

  private static final Setting INSTANCE = new Setting();

  private Setting() {

  }

  public static Setting getInstance() {
    return INSTANCE;
  }

}
