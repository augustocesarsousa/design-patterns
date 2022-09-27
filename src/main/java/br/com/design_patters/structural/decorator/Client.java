package main.java.br.com.design_patters.structural.decorator;

import main.java.br.com.design_patters.structural.decorator.decorators.DoubleDrink;
import main.java.br.com.design_patters.structural.decorator.decorators.Milk;
import main.java.br.com.design_patters.structural.decorator.models.Coffee;
import main.java.br.com.design_patters.structural.decorator.models.Drink;
import main.java.br.com.design_patters.structural.decorator.models.Tea;

/**
 * Client
 */
public class Client {

  public static void order(String name, Drink drink) {
    System.out.println("Ordering a " + name);
    drink.serve();
    System.out.println(drink.getPrice());
    System.out.println("---------------");
  }

  public static void main(String[] args) {
    order("Coffee", new Coffee());
    order("Tea", new Tea());
    order("Coffee with milk", new Milk(new Coffee()));
    order("Double tea", new DoubleDrink(new Tea()));
    order("Double coffee with milk", new DoubleDrink(new Milk(new Coffee())));
  }
}
