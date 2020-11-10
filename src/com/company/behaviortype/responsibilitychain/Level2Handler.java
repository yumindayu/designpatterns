package com.company.behaviortype.responsibilitychain;

public class Level2Handler extends Handler{
  @Override
  public void doSomething(int money) {
    if (money > 10 && money < 101) {
      System.out.println("level2 handler");
    } else {
      nextHandler.doSomething(money);
    }
  }
}
