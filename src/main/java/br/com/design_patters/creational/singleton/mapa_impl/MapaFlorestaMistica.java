package main.java.br.com.design_patters.creational.singleton.mapa_impl;

import main.java.br.com.design_patters.creational.singleton.model.Dia;
import main.java.br.com.design_patters.creational.singleton.model.Mapa;

public class MapaFlorestaMistica extends Mapa {

    public MapaFlorestaMistica(Dia dia) {
        super(dia);
    }

    @Override
    public void descricao() {
        System.out.println("Mapa");
        System.out.println("\tFloresta Mística");
        System.out.println("\tTipo floresta");
        System.out.println("\tRequer nível 5");
        System.out.println("\tMonstros até nível 10");
        System.out.println("\tData " + this.dia.getData());
        System.out.println("\tTurno " + this.dia.getTurno());
    }

}
