package com.company.behaviortype.observer;

public class ConcreteSubject extends Subject{
  private String state;

  public String getState() {
    return state;
  }

  public void changeStatre(String state) {
    this.nofityObservers(state);
  }
}
