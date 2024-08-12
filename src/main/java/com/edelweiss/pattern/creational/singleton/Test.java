package com.edelweiss.pattern.creational.singleton;

import com.edelweiss.pattern.creational.singleton.billpughimplementation.Singleton;

public class Test {
  public static void main(String[] args) {
    Singleton single = Singleton.getInstance();
    Singleton single2 = Singleton.getInstance();
    if (single == single2) {
      System.out.println("Singleton");
    } else {
      System.out.println("Error in implementation");
    }
  }
}
