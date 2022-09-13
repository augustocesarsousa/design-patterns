package main.java.br.com.design_patters.creational.factory_method.model.impl;

import main.java.br.com.design_patters.creational.factory_method.model.Monstro;

public class MonstroInseto implements Monstro {

    @Override
    public void atributos() {
        System.out.println("Atributos");
        System.out.println("\tEscorpião");
        System.out.println("\tMédio porte");
        System.out.println("\tVive em florestas");
    }

    @Override
    public void atacar() {
        System.out.println("Escorpião usou Ferroada");
    }

}
