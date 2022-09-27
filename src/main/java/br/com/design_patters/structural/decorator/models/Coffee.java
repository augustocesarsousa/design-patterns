package main.java.br.com.design_patters.structural.decorator.models;

/**
 * Coffee
 */
public class Coffee implements Drink {

  @Override
  public void serve() {
    System.out.println("- Adding 100ml of coffee");
  }

  @Override
  public Double getPrice() {
    return 1.5;
  }
}
