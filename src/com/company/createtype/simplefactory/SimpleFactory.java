package com.company.createtype.simplefactory;



public class SimpleFactory {
  public static Product createProduct(String type) {
    if ("A".equals(type)) {
      return new ProductA();
    } else {
      return new ProductB();
    }
  }
}
