package com.company.structuretype.adapter;

public class Adapter {
  private CalculateInteger calculateInteger;

  public Adapter(CalculateInteger calculateInteger) {
    this.calculateInteger = calculateInteger;
  }

  public String add(int n) {
    int sum = this.calculateInteger.add(100);
    return String.valueOf(sum);
  }
}
