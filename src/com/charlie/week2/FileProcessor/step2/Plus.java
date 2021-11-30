package com.charlie.week2.FileProcessor.step2;

public class Plus extends FileProcessor {

  public Plus(String path) {
    super(path);
  }

  @Override
  protected int getResult(int result, int number) {
    return result += number;
  }
}
