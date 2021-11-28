package com.charlie.week1.setting.step3.end;

public class Setting {

  private static final Setting INSTANCE = new Setting();

  private Setting() {

  }

  public static Setting getInstance() {
    return INSTANCE;
  }

}
