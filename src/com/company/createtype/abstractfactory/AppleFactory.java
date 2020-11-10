package com.company.createtype.abstractfactory;

public class AppleFactory extends AbstractFactory {
  @Override
  public Phone createPhone() {
    return new IPhone();
  }

  @Override
  public Labtop createLabtop() {
    return new MacPro();
  }
}
