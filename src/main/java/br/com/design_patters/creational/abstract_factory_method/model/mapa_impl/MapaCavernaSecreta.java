package main.java.br.com.design_patters.creational.abstract_factory_method.model.mapa_impl;

import main.java.br.com.design_patters.creational.abstract_factory_method.model.Mapa;

public class MapaCavernaSecreta implements Mapa {

    @Override
    public void descricao() {
        System.out.println("Mapa");
        System.out.println("\tCaverna Secreta");
        System.out.println("\tTipo calabouço");
        System.out.println("\tRequer nível 1");
        System.out.println("\tMonstros até nível 5");
    }

}
