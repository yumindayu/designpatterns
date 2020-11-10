package com.company.structuretype.adapter;

public class CalculateInteger {
  public Integer add(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }
}
