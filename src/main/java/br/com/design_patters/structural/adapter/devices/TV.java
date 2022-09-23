package main.java.br.com.design_patters.structural.adapter.devices;

import main.java.br.com.design_patters.structural.adapter.interfaces.HDMI;

public class TV implements HDMI {

  @Override
  public void setImage(String image) {
    System.out.println("\tPlaying video: " + image);
  }

  @Override
  public void setSound(String sound) {
    System.out.println("\tPlaying sound: " + sound);
  }
}
