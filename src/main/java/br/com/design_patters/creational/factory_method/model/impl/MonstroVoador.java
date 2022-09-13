package main.java.br.com.design_patters.creational.factory_method.model.impl;

import main.java.br.com.design_patters.creational.factory_method.model.Monstro;

public class MonstroVoador implements Monstro {

    @Override
    public void atributos() {
        System.out.println("Atributos");
        System.out.println("\tHarpia");
        System.out.println("\tGrande porte");
        System.out.println("\tVive em montanhas");
    }

    @Override
    public void atacar() {
        System.out.println("Harpia usou Garras");
    }

}
