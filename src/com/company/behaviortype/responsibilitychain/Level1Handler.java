package com.company.behaviortype.responsibilitychain;

public class Level1Handler extends Handler{
  @Override
  public void doSomething(int money) {
    if (money < 11) {
      System.out.println("level1 handler");
    } else {
      nextHandler.doSomething(money);
    }
  }
}
