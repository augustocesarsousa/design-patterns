package main.java.br.com.design_patters.creational.abstract_factory_method.model;

public class Grupo {
    private Mapa mapa;
    private Monstro monstro;

    public Grupo(Mapa mapa, Monstro monstro) {
        this.mapa = mapa;
        this.monstro = monstro;
    }

    public void descricaoMapa() {
        mapa.descricao();
    }

    public void atributosMonstro() {
        monstro.atributos();
    }
}
