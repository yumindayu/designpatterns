package com.company.createtype.factoryfunction;

public class FactoryA extends FactoryFunction{
  @Override
  public Product createProduct() {
    return new ProductA();
  }
}
