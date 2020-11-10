package com.company.createtype.builder;

public class CarBuilder implements Builder{
  @Override
  public String buildEngine() {
    return "建造引擎";
  }

  @Override
  public String buildTires() {
    return "建造轮胎";
  }

  @Override
  public String buildSeat() {
    return "建造座椅";
  }
}
