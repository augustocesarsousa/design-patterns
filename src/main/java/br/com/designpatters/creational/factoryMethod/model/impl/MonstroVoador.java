package main.java.br.com.designpatters.creational.factoryMethod.model.impl;

import main.java.br.com.designpatters.creational.factoryMethod.model.Monstro;

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
