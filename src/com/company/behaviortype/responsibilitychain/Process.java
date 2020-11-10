package com.company.behaviortype.responsibilitychain;

public class Process {

  public void request(int money) {
    Handler level1 = new Level1Handler();
    Handler level2 = new Level2Handler();
    Handler level3 = new LevelHandler3();
    level1.setNextHandler(level2);
    level2.setNextHandler(level3);
    level1.doSomething(money);
  }
}
