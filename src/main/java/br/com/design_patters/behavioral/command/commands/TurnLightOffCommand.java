package main.java.br.com.design_patters.behavioral.command.commands;

import main.java.br.com.design_patters.behavioral.command.lights.GenericLight;

public class TurnLightOffCommand implements Command {

  private GenericLight light;

  public TurnLightOffCommand(GenericLight light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOff();
  }
}
