package com.company.createtype.builder;

public class CarDirector {
  private Builder builder;

  public CarDirector(Builder builder) {
    this.builder = builder;
  }

  public Car buildCar() {
    Car car = new Car();
    car.setEngine(this.builder.buildEngine());
    car.setTires(this.builder.buildTires());
    car.setSeat(this.builder.buildSeat());
    return car;
  }
}
