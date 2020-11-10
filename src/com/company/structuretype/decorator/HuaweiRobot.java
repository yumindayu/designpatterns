package com.company.structuretype.decorator;

public class HuaweiRobot implements Robot{
  @Override
  public void sing() {
    System.out.println("i am a huawei robot, i am singing");
  }

  @Override
  public void dance() {
    System.out.println("i am a huawei robot, i am dancing");
  }

  @Override
  public void clean() {
    System.out.println("i am a huawei robot, i am cleaning");
  }
}
