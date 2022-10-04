package main.java.br.com.design_patters.structural.mediator.mediator;

import main.java.br.com.design_patters.structural.mediator.model.User;
import main.java.br.com.design_patters.structural.mediator.services.Translator;

public class TranslatorMediator extends Mediator {

  private Translator translator = new Translator();

  protected String getMessage(String message, User to, User from) {
    return translator.getTranslation(
      from.getLanguage(),
      to.getLanguage(),
      message
    );
  }
}
