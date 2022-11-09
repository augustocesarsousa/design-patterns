package main.java.br.com.design_patters.behavioral.observer;

import main.java.br.com.design_patters.behavioral.observer.observers.Friend;
import main.java.br.com.design_patters.behavioral.observer.observers.Wife;
import main.java.br.com.design_patters.behavioral.observer.subject.Doorman;

public class Client {

  public static void main(String[] args) {
    Doorman doorman = new Doorman();
    doorman.add(new Wife());
    doorman.add(new Friend());

    System.out.println("Husband is comming");
    doorman.setStatus(true);
  }
}
