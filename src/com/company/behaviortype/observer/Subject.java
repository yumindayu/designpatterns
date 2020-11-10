package com.company.behaviortype.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
  public List<AbstractObserver> observers = new ArrayList<>();;

  public void attach(AbstractObserver observer) {
    observers.add(observer);
  }

  public void  detach(AbstractObserver observer) {
    observers.remove(observer);
  }

  public void nofityObservers(String state) {
    for (AbstractObserver observer : observers) {
      observer.notice(state);
    }
  }
}
