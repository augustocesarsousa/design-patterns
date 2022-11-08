package main.java.br.com.design_patters.behavioral.command.commands;

import main.java.br.com.design_patters.behavioral.command.lights.GenericLight;

public class TurnLightOnCommand implements Command {

  private GenericLight light;

  public TurnLightOnCommand(GenericLight light) {
    this.light = light;
  }

  @Override
  public void execute() {
    light.turnOn();
  }
}
