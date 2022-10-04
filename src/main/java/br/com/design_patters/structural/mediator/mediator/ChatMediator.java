package main.java.br.com.design_patters.structural.mediator.mediator;

import main.java.br.com.design_patters.structural.mediator.model.User;

public class ChatMediator extends Mediator {

  public String getMessage(String message, User to, User from) {
    return message;
  }
}
