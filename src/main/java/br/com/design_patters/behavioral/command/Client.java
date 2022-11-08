package main.java.br.com.design_patters.behavioral.command;

import main.java.br.com.design_patters.behavioral.command.alexa.Alexa;
import main.java.br.com.design_patters.behavioral.command.commands.TurnLightOffCommand;
import main.java.br.com.design_patters.behavioral.command.commands.TurnLightOnCommand;
import main.java.br.com.design_patters.behavioral.command.lights.PhillipsHueLight;
import main.java.br.com.design_patters.behavioral.command.lights.XiaomiLight;

public class Client {

  public static void configureAlexa(Alexa alexa) {
    PhillipsHueLight livingRoom = new PhillipsHueLight();
    XiaomiLight kitchen = new XiaomiLight();

    alexa.addIntegration(
      "Turn on the Living room light",
      new TurnLightOnCommand(livingRoom),
      "on",
      "Living room",
      "light"
    );
    alexa.addIntegration(
      "Turn off the Living room light",
      new TurnLightOffCommand(livingRoom),
      "off",
      "Living room",
      "light"
    );
    alexa.addIntegration(
      "Turn on the Kitchen light",
      new TurnLightOnCommand(kitchen),
      "on",
      "Kitchen",
      "light"
    );
    alexa.addIntegration(
      "Turn off the Kitchen light",
      new TurnLightOffCommand(kitchen),
      "off",
      "Kitchen",
      "light"
    );
  }

  public static void main(String[] args) {
    Alexa alexa = new Alexa();
    configureAlexa(alexa);

    alexa.sendRequest("Turn on the Living room light");
    alexa.sendRequest("Turn off the Kitchen light");

    alexa.sendRequest("Please, could you Turn off the Living room light?");
  }
}
