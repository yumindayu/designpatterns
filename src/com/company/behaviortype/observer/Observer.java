package com.company.behaviortype.observer;

public class Observer extends AbstractObserver{
  @Override
  public void notice(String state) {
    System.out.println("i accept this state " + state);
  }
}
