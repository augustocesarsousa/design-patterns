package main.java.br.com.design_patters.behavioral.strategy.strategies.work;

public class NoWorkStrategy implements WorkStrategy {

  @Override
  public void work() {
    System.out.println("I have no job. Dou you have some money?");
  }
}
