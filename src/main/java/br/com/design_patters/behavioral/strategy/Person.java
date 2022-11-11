package main.java.br.com.design_patters.behavioral.strategy;

import main.java.br.com.design_patters.behavioral.strategy.strategies.eat.EatStrategy;
import main.java.br.com.design_patters.behavioral.strategy.strategies.transportation.TransportationStrategy;
import main.java.br.com.design_patters.behavioral.strategy.strategies.work.WorkStrategy;

public class Person {

  private EatStrategy eatStrategy;
  private TransportationStrategy moveStrategy;
  private WorkStrategy workStrategy;
  private String name;

  public Person(
    String name,
    EatStrategy eatStrategy,
    TransportationStrategy moveStrategy,
    WorkStrategy workStrategy
  ) {
    this.name = name;
    this.eatStrategy = eatStrategy;
    this.moveStrategy = moveStrategy;
    this.workStrategy = workStrategy;
  }

  public String getName() {
    return this.name;
  }

  public void eat() {
    eatStrategy.eat();
  }

  public void move() {
    moveStrategy.move();
  }

  public void work() {
    workStrategy.work();
  }
}
