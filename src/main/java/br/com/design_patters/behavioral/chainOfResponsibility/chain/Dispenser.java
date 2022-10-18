package main.java.br.com.design_patters.behavioral.chainOfResponsibility.chain;

import main.java.br.com.design_patters.behavioral.chainOfResponsibility.model.Bill;

public class Dispenser {

  private Bill chain;

  public Dispenser() {
    chain =
      new Bill(
        200,
        new Bill(
          100,
          new Bill(
            50,
            new Bill(20, new Bill(10, new Bill(5, new Bill(1, null))))
          )
        )
      );
  }

  public void withDraw(Integer ammount) {
    chain.execute(ammount);
  }
}
