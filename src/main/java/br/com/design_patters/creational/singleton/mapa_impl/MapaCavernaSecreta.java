package main.java.br.com.design_patters.creational.singleton.mapa_impl;

import main.java.br.com.design_patters.creational.singleton.model.Dia;
import main.java.br.com.design_patters.creational.singleton.model.Mapa;

public class MapaCavernaSecreta extends Mapa {

    public MapaCavernaSecreta(Dia dia) {
        super(dia);
    }

    @Override
    public void descricao() {
        System.out.println("Mapa");
        System.out.println("\tCaverna Secreta");
        System.out.println("\tTipo calabouço");
        System.out.println("\tRequer nível 1");
        System.out.println("\tMonstros até nível 5");
        System.out.println("\tData " + this.dia.getData());
        System.out.println("\tTurno " + this.dia.getTurno());
    }

}
