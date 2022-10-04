package main.java.br.com.design_patters.structural.mediator.model;

import main.java.br.com.design_patters.structural.mediator.mediator.Mediator;

public final class PortugueseUser extends User {

  public PortugueseUser(String name, Mediator mediator) {
    super(name, mediator, Language.PORTUGUESE);
  }
}
