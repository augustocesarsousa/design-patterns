package main.java.br.com.design_patters.structural.decorator.decorators;

import main.java.br.com.design_patters.structural.decorator.models.Drink;

/**
 * DrinkDecorator
 */
public abstract class DrinkDecorator implements Drink {

  protected Drink drink;

  public DrinkDecorator(Drink drink) {
    this.drink = drink;
  }
}
