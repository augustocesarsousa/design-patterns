package main.java.br.com.design_patters.estructural.adapter;

import main.java.br.com.design_patters.estructural.adapter.adapters.HDMIToVGAAdapter;
import main.java.br.com.design_patters.estructural.adapter.devices.Computer;
import main.java.br.com.design_patters.estructural.adapter.devices.OldMonitor;
import main.java.br.com.design_patters.estructural.adapter.devices.TV;

public class Client {
    public static void main(String[] args) {

        System.out.println("Computer with TV");
        Computer computer = new Computer();
        TV tv = new TV();
        computer.connectPort(tv);
        computer.sendImageAndSound("Trailer Avengers", "Sound theme");

        System.out.println("");
        System.out.println("Computer with Old monitor");
        Computer computer2 = new Computer();
        OldMonitor oldMonitor = new OldMonitor();
        computer2.connectPort(new HDMIToVGAAdapter(oldMonitor));
        computer2.sendImageAndSound("Trailer Justice League", "Sound theme");
    }
}
