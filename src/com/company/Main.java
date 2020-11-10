package com.company;

import com.company.behaviortype.strategy.EmailNotify;
import com.company.behaviortype.strategy.SmsNotify;
import com.company.behaviortype.strategy.User;
import com.company.createtype.Singleton;
import com.company.createtype.abstractfactory.AbstractFactory;
import com.company.createtype.abstractfactory.AppleFactory;
import com.company.createtype.abstractfactory.XiaomiFactory;
import com.company.createtype.factoryfunction.FactoryA;
import com.company.createtype.factoryfunction.FactoryFunction;
import com.company.createtype.simplefactory.Product;
import com.company.createtype.simplefactory.SimpleFactory;
import com.company.structuretype.adapter.CalculateInteger;
import com.company.behaviortype.observer.AbstractObserver;
import com.company.behaviortype.observer.ConcreteSubject;
import com.company.behaviortype.observer.Observer;
import com.company.behaviortype.observer.Subject;
import com.company.structuretype.decorator.HuaweiRobot;
import com.company.structuretype.adapter.Adapter;
import com.company.structuretype.decorator.decorator.AbstractDecorator;
import com.company.structuretype.decorator.decorator.RobotDecorator;
import com.company.behaviortype.responsibilitychain.Process;

public class Main {

  public static void main(String[] args) {
    //test singleton
    System.out.println(Singleton.getInstance());
    System.out.println(Singleton.getInstance());
    //test simple factory
    Product productA = SimpleFactory.createProduct("A");
    productA.doSomething();
    Product productB = SimpleFactory.createProduct("B");
    productB.doSomething();
    // test factory function
    FactoryFunction productA1 = new FactoryA();
    productA1.createProduct().doSomething();
    //test abstract factory
    AbstractFactory apple = new AppleFactory();
    apple.createPhone().doSomething();
    apple.createLabtop().doSomething();

    AbstractFactory xiaomi = new XiaomiFactory();
    xiaomi.createPhone().doSomething();
    xiaomi.createLabtop().doSomething();
    //test decorator
    AbstractDecorator decorator = new RobotDecorator(new HuaweiRobot());
    decorator.upgrade();
    //test adapter
    // 模拟一个客户端解析不了整型，但是目标方法只提供整型返回，这时需要一个适配器将整型转为字符串返回
    Adapter adapter = new Adapter(new CalculateInteger());
    System.out.println(adapter.add(100).getClass().toString()); //此处证明返回的类型是字符串
    //test observer
    Subject subject = new ConcreteSubject();
    AbstractObserver observer1 = new Observer();
    AbstractObserver observer2 = new Observer();
    subject.attach(observer1);
    subject.attach(observer2);
    subject.nofityObservers("ordered");
    subject.detach(observer2);
    subject.nofityObservers("payment");
    //test strategy
    User user1 = new User(new EmailNotify());
    user1.register();
    User user2 = new User(new SmsNotify());
    user2.register();
    //test responsibility chain
    Process process = new Process();
    process.request(10);
  }
}
