package com.company.behaviortype.template;

public abstract class Template {
  //具体抽象方法由子类实现
  public abstract void step1();
  public abstract void step2();
  public abstract void step3();

  public void process() {
    System.out.println("process begin");
    step1();
    step2();
    step3();
    System.out.println("process end");
  }
}
