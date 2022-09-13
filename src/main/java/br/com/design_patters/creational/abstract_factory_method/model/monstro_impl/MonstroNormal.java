package main.java.br.com.design_patters.creational.abstract_factory_method.model.monstro_impl;

import main.java.br.com.design_patters.creational.abstract_factory_method.model.Monstro;

public class MonstroNormal implements Monstro {

    @Override
    public void atributos() {
        System.out.println("Monstro");
        System.out.println("\tGoblin");
        System.out.println("\tNível 2");
        System.out.println("\tPequeno porte");
        System.out.println("\tVive em cavernas");
    }

    @Override
    public void atacar() {
        System.out.println("Atacando");
        System.out.println("\tGoblin usou Pancada");
    }

}
