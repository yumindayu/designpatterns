package com.company.behaviortype.strategy;

public class SmsNotify extends NotifyUser{
  @Override
  public void send(int userId) {
    System.out.println("this notice is sended by sms to " + userId);
  }
}
