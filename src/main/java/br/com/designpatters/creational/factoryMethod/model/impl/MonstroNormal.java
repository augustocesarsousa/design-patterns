package main.java.br.com.designpatters.creational.factoryMethod.model.impl;

import main.java.br.com.designpatters.creational.factoryMethod.model.Monstro;

public class MonstroNormal implements Monstro {

    @Override
    public void atributos() {
        System.out.println("Atributos");
        System.out.println("\tGoblin");
        System.out.println("\tPequeno porte");
        System.out.println("\tVive em cavernas");
    }

    @Override
    public void atacar() {
        System.out.println("Atacando");
        System.out.println("\tGoblin usou Pancada");
    }

}
