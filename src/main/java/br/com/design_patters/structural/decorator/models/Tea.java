package main.java.br.com.design_patters.structural.decorator.models;

/**
 * Tea
 */
public class Tea implements Drink {

  @Override
  public void serve() {
    System.out.println("- Adding 50ml of tea");
  }

  @Override
  public Double getPrice() {
    return 1d;
  }
}
