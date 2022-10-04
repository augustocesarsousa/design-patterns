package main.java.br.com.design_patters.structural.mediator;

import main.java.br.com.design_patters.structural.mediator.mediator.Mediator;
import main.java.br.com.design_patters.structural.mediator.mediator.TranslatorMediator;
import main.java.br.com.design_patters.structural.mediator.model.EnglishUser;
import main.java.br.com.design_patters.structural.mediator.model.PortugueseUser;
import main.java.br.com.design_patters.structural.mediator.model.User;

public class Client {

  public static void main(String[] args) {
    // Mediator chatRoom = new ChatMediator();
    Mediator chatRoom = new TranslatorMediator();

    User alan = new EnglishUser("Alan", chatRoom);
    User jose = new PortugueseUser("Jose", chatRoom);
    User sue = new EnglishUser("Sue", chatRoom);
    User maria = new PortugueseUser("Maria", chatRoom);

    chatRoom.addUser(alan);
    chatRoom.addUser(sue);
    chatRoom.addUser(maria);

    alan.sendMessage("Hello");
    maria.sendMessage("Oi", alan);

    chatRoom.removeUser(sue);

    alan.sendMessage("How are you?", maria);
    maria.sendMessage("Estou bem, obrigado.", alan);

    chatRoom.addUser(jose);

    jose.sendMessage("Oi");

    chatRoom.removeUser(maria);
  }
}
