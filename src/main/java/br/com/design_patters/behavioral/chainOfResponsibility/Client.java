package main.java.br.com.design_patters.behavioral.chainOfResponsibility;

import main.java.br.com.design_patters.behavioral.chainOfResponsibility.chain.Dispenser;

public class Client {

  public static void main(String[] args) {
    Dispenser dispenser = new Dispenser();
    System.out.println("Withdrawing $230...");
    dispenser.withDraw(758);
    System.out.println("Withdrawing $1589...");
    dispenser.withDraw(1589);
  }
}
