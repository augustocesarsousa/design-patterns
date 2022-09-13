package main.java.br.com.design_patters.creational.abstract_factory_method;

import main.java.br.com.design_patters.creational.abstract_factory_method.abstract_factory.GrupoAbstractFactory;
import main.java.br.com.design_patters.creational.abstract_factory_method.model.Grupo;

public class Client {
    public static void main(String[] args) {
        System.out.println("Criando Grupo nível 1");
        Grupo grupoNivel1 = GrupoAbstractFactory.criar("nivel1");
        grupoNivel1.descricaoMapa();
        grupoNivel1.atributosMonstro();

        System.out.println("\nCriando Grupo nível 2");
        Grupo grupoNivel2 = GrupoAbstractFactory.criar("nivel2");
        grupoNivel2.descricaoMapa();
        grupoNivel2.atributosMonstro();
    }
}
