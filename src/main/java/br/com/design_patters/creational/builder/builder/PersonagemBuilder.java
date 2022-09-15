package main.java.br.com.design_patters.creational.builder.builder;

import java.util.List;

import main.java.br.com.design_patters.creational.builder.enuns.Tipo;
import main.java.br.com.design_patters.creational.builder.model.Personagem;

public class PersonagemBuilder {
    // obrigatorios
    private String nome;
    private Tipo tipo;

    // padrao 1
    private Integer level;

    // opcionais
    private String armaPrincipal;
    private String armaSecundaria;
    private String escudo;
    private String armadura;
    private String roupao;
    private List<String> magias;

    public PersonagemBuilder(String nome, Tipo tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = 1;
    }

    public PersonagemBuilder armaPrincipal(String arma) {
        this.armaPrincipal = arma;
        return this;
    }

    public PersonagemBuilder armaSecundaria(String arma) {
        this.armaSecundaria = arma;
        return this;
    }

    public PersonagemBuilder escudo(String escudo) {
        this.escudo = escudo;
        return this;
    }

    public PersonagemBuilder armadura(String armadura) {
        this.armadura = armadura;
        return this;
    }

    public PersonagemBuilder roupao(String roupao) {
        this.roupao = roupao;
        return this;
    }

    public PersonagemBuilder magias(List<String> magias) {
        this.magias = magias;
        return this;
    }

    public Personagem criar() {
        return new Personagem(nome, tipo, level, armaPrincipal, armaSecundaria, escudo, armadura, roupao, magias);
    }
}
