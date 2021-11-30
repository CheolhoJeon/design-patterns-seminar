package com.charlie.week2.FileProcessor.step2;

public class Application {

  public static void main(String[] args) {
    FileProcessor fileProcessor = new Multiply("number.txt");
    int result = fileProcessor.process();
    System.out.println(result);
  }

}
