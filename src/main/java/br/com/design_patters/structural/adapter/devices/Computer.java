package main.java.br.com.design_patters.structural.adapter.devices;

import main.java.br.com.design_patters.structural.adapter.interfaces.HDMI;

public class Computer {

  private HDMI port;

  public void connectPort(HDMI screen) {
    System.out.println("\tConnecting on HDMI port...");
    this.port = screen;
  }

  public void sendImageAndSound(String image, String sound) {
    if (port == null) {
      System.out.println("Connect a HDMI cable first");
    } else {
      port.setImage(image);
      port.setSound(sound);
    }
  }
}
