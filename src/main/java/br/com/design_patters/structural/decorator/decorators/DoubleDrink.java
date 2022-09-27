package main.java.br.com.design_patters.structural.decorator.decorators;

import main.java.br.com.design_patters.structural.decorator.models.Drink;

/**
 * DoubleDrink
 */
public class DoubleDrink extends DrinkDecorator {

  public DoubleDrink(Drink drink) {
    super(drink);
  }

  @Override
  public void serve() {
    drink.serve();
    drink.serve();
  }

  @Override
  public Double getPrice() {
    return drink.getPrice() * 1.75;
  }
}
