package com.company.behaviortype.strategy;

public class EmailNotify extends NotifyUser{
  @Override
  public void send(int userId) {
    System.out.println("this notice is sended by email to " + userId);
  }
}
