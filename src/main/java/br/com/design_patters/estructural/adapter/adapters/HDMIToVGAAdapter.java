package main.java.br.com.design_patters.estructural.adapter.adapters;

import main.java.br.com.design_patters.estructural.adapter.interfaces.HDMI;
import main.java.br.com.design_patters.estructural.adapter.interfaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
    private VGA vga;

    public HDMIToVGAAdapter(VGA vga) {
        System.out.println("\tConnecting the HDMI to VGA adapter...");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("\tConverting the image from HDMI do VGA...");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("\tVGA cable don't work with sound");
    }

}