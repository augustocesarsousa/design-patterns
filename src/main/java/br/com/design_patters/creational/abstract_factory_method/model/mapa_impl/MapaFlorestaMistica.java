package main.java.br.com.design_patters.creational.abstract_factory_method.model.mapa_impl;

import main.java.br.com.design_patters.creational.abstract_factory_method.model.Mapa;

public class MapaFlorestaMistica implements Mapa {

    @Override
    public void descricao() {
        System.out.println("Mapa");
        System.out.println("\tFloresta Mística");
        System.out.println("\tTipo floresta");
        System.out.println("\tRequer nível 5");
        System.out.println("\tMonstros até nível 10");
    }

}
