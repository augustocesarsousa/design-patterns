package main.java.br.com.designpatters.creational.factoryMethod;

import main.java.br.com.designpatters.creational.factoryMethod.factory.MonstroFactory;
import main.java.br.com.designpatters.creational.factoryMethod.model.Monstro;

public class Client {
    public static void main(String[] args) {
        System.out.println("Criando monstro nível 1:");
        Monstro monstro1 = MonstroFactory.criar("nivel1");
        System.out.println(monstro1);

        System.out.println("\nCriando monstro nível 2:");
        Monstro monstro2 = MonstroFactory.criar("nivel2");
        System.out.println(monstro2);

        System.out.println("\nCriando monstro nível 3:");
        Monstro monstro3 = MonstroFactory.criar("nivel3");
        System.out.println(monstro3);
    }
}
