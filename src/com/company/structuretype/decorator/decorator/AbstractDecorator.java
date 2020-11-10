package com.company.structuretype.decorator.decorator;

import com.company.structuretype.decorator.Robot;

public abstract class AbstractDecorator implements Robot {
  private Robot robot;

  public AbstractDecorator(Robot robot) {
    this.robot = robot;
  }

  @Override
  public void sing() {
    this.robot.sing();
  }

  @Override
  public void dance() {
    this.robot.dance();
  }

  @Override
  public void clean() {
    this.robot.clean();
  }

  public abstract void upgrade();
}
