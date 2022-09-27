package main.java.br.com.design_patters.structural.decorator.decorators;

import main.java.br.com.design_patters.structural.decorator.models.Drink;

/**
 * Milk
 */
public class Milk extends DrinkDecorator {

  public Milk(Drink drink) {
    super(drink);
  }

  @Override
  public void serve() {
    drink.serve();
    System.out.println("- Adding 30ml of Milk");
  }

  @Override
  public Double getPrice() {
    return drink.getPrice() + 0.5;
  }
}
