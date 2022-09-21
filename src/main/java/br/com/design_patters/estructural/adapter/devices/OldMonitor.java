package main.java.br.com.design_patters.estructural.adapter.devices;

import main.java.br.com.design_patters.estructural.adapter.interfaces.VGA;

public class OldMonitor implements VGA {

    @Override
    public void setImage(String image) {
        System.out.println("\tPlaying video: " + image);
    }

}
