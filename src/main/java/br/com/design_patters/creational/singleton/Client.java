package main.java.br.com.design_patters.creational.singleton;

import main.java.br.com.design_patters.creational.singleton.enuns.Turno;
import main.java.br.com.design_patters.creational.singleton.mapa_impl.MapaCavernaSecreta;
import main.java.br.com.design_patters.creational.singleton.mapa_impl.MapaFlorestaMistica;
import main.java.br.com.design_patters.creational.singleton.model.Dia;
import main.java.br.com.design_patters.creational.singleton.model.Mapa;

public class Client {

    public static void main(String[] args) {
        Dia dia = Dia.getInstance();

        Mapa mapa1 = new MapaCavernaSecreta(dia);
        Mapa mapa2 = new MapaFlorestaMistica(dia);

        mapa1.descricao();
        mapa2.descricao();

        System.out.println("\nAlterando turno para TARDE...\n");
        dia.setTurno(Turno.TARDE);

        mapa1.descricao();
        mapa2.descricao();
    }
}