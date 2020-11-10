package com.company.createtype.factoryfunction;

public class FactoryB extends FactoryFunction{
  @Override
  public Product createProduct() {
    return new ProductB();
  }
}
