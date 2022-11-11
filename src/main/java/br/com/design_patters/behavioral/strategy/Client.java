package main.java.br.com.design_patters.behavioral.strategy;

import main.java.br.com.design_patters.behavioral.strategy.strategies.eat.MeatFoodStrategy;
import main.java.br.com.design_patters.behavioral.strategy.strategies.eat.VeggieFoodStrategy;
import main.java.br.com.design_patters.behavioral.strategy.strategies.transportation.AirplaneStrategy;
import main.java.br.com.design_patters.behavioral.strategy.strategies.transportation.BikeStrategy;
import main.java.br.com.design_patters.behavioral.strategy.strategies.transportation.CarStrategy;
import main.java.br.com.design_patters.behavioral.strategy.strategies.transportation.WalkStrategy;
import main.java.br.com.design_patters.behavioral.strategy.strategies.work.DeveloperStrategy;
import main.java.br.com.design_patters.behavioral.strategy.strategies.work.NoWorkStrategy;
import main.java.br.com.design_patters.behavioral.strategy.strategies.work.PilotStrategy;

public class Client {

  public static void presentYourself(Person person) {
    System.out.println("Hi, I'm " + person.getName());
    person.eat();
    person.move();
    person.work();
    System.out.println("----------------");
  }

  public static void main(String[] args) {
    Person jhon = new Person(
      "Jhon",
      new MeatFoodStrategy(),
      new CarStrategy(),
      new DeveloperStrategy()
    );
    presentYourself(jhon);

    Person ann = new Person(
      "Ann",
      new MeatFoodStrategy(),
      new AirplaneStrategy(),
      new PilotStrategy()
    );
    presentYourself(ann);

    Person carol = new Person(
      "Carol",
      new VeggieFoodStrategy(),
      new BikeStrategy(),
      new DeveloperStrategy()
    );
    presentYourself(carol);

    Person alan = new Person(
      "Alan",
      new VeggieFoodStrategy(),
      new WalkStrategy(),
      new NoWorkStrategy()
    );
    presentYourself(alan);
  }
}
