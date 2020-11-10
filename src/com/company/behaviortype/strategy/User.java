package com.company.behaviortype.strategy;

public class User {
  private NotifyUser notifyUser;

  public User(NotifyUser notifyUser) {
    this.notifyUser = notifyUser;
  }

  public void register() {
    int userId = 100;
    this.notifyUser.send(userId);

  }
}
