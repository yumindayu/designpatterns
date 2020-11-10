package com.company.createtype.builder;

public class Car {
  private String engine;

  public String getEngine() {
    return engine;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public String getTires() {
    return tires;
  }

  @Override
  public String toString() {
    return "Car{" +
            "engine='" + engine + '\'' +
            ", tires='" + tires + '\'' +
            ", seat='" + seat + '\'' +
            '}';
  }

  public void setTires(String tires) {
    this.tires = tires;
  }

  public String getSeat() {
    return seat;
  }

  public void setSeat(String seat) {
    this.seat = seat;
  }

  private String tires;
  private String seat;
}
