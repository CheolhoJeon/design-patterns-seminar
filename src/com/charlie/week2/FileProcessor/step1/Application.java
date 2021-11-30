package com.charlie.week2.FileProcessor.step1;

import com.charlie.week2.FileProcessor.step1.FileProcessor;

public class Application {

  public static void main(String[] args) {
    FileProcessor fileProcessor = new FileProcessor("number.txt");
    int result = fileProcessor.process();
    System.out.println(result);
  }

}
