package main.java.br.com.design_patters.structural.mediator.model;

import main.java.br.com.design_patters.structural.mediator.mediator.Mediator;

public class EnglishUser extends User {

  public EnglishUser(String name, Mediator mediator) {
    super(name, mediator, Language.ENGLISH);
  }
}
