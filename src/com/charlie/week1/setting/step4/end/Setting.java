package com.charlie.week1.setting.step4.end;

public class Setting {

  private static class SettingHolder {
    private static final Setting INSTANCE = new Setting();
  }

  private Setting() {

  }

  public static Setting getInstance() {
    return SettingHolder.INSTANCE;
  }

}
