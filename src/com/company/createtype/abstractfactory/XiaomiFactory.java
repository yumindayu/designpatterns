package com.company.createtype.abstractfactory;

public class XiaomiFactory extends AbstractFactory {
  @Override
  public Phone createPhone() {
    return new Mi();
  }

  @Override
  public Labtop createLabtop() {
    return new Youga();
  }
}
