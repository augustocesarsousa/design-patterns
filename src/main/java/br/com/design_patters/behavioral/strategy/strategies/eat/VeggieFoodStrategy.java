package main.java.br.com.design_patters.behavioral.strategy.strategies.eat;

public class VeggieFoodStrategy implements EatStrategy {

  @Override
  public void eat() {
    System.out.println("I eat veggie food!");
  }
}
