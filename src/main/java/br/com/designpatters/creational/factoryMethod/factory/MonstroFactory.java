package main.java.br.com.designpatters.creational.factoryMethod.factory;

import main.java.br.com.designpatters.creational.factoryMethod.model.Monstro;
import main.java.br.com.designpatters.creational.factoryMethod.model.impl.MonstroInseto;
import main.java.br.com.designpatters.creational.factoryMethod.model.impl.MonstroNormal;
import main.java.br.com.designpatters.creational.factoryMethod.model.impl.MonstroVoador;

/**
 * MonstroFactory
 */
public abstract class MonstroFactory {

    public static Monstro criar(String nivel) {
        Monstro monstro = null;

        if ("nivel1".equals(nivel)) {
            monstro = new MonstroNormal();
        }

        if ("nivel2".equals(nivel)) {
            monstro = new MonstroInseto();
        }

        if ("nivel3".equals(nivel)) {
            monstro = new MonstroVoador();
        }

        if (monstro != null) {
            monstro.atributos();
            monstro.atacar();
        }

        return monstro;
    }
}