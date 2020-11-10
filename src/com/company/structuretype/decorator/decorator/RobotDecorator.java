package com.company.structuretype.decorator.decorator;

import com.company.structuretype.decorator.Robot;

public class RobotDecorator extends AbstractDecorator{

  public RobotDecorator(Robot robot) {
    super(robot);
  }

  public void upgrade() {
    this.sing();
    this.dance();
    this.clean();
    System.out.println("i can drive now");
  }

}
