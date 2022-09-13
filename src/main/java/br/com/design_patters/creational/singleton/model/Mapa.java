package main.java.br.com.design_patters.creational.singleton.model;

public abstract class Mapa {

    protected Dia dia;

    public Mapa(Dia dia) {
        this.dia = dia;
    }

    public abstract void descricao();

}
