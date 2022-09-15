package main.java.br.com.design_patters.creational.builder.model;

import java.util.List;

import main.java.br.com.design_patters.creational.builder.enuns.Tipo;

public class Personagem {
    private String nome;
    private Tipo tipo;
    private Integer level;
    private String armaPrincipal;
    private String armaSecundaria;
    private String escudo;
    private String armadura;
    private String roupao;
    private List<String> magias;

    public Personagem(String nome, Tipo tipo, Integer level, String armaPrincipal, String armaSecundaria, String escudo,
            String armadura, String roupao, List<String> magias) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        this.armaPrincipal = armaPrincipal;
        this.armaSecundaria = armaSecundaria;
        this.escudo = escudo;
        this.armadura = armadura;
        this.roupao = roupao;
        this.magias = magias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    public String getArmaSecundaria() {
        return armaSecundaria;
    }

    public void setArmaSecundaria(String armaSecundaria) {
        this.armaSecundaria = armaSecundaria;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public String getRoupao() {
        return roupao;
    }

    public void setRoupao(String roupao) {
        this.roupao = roupao;
    }

    public List<String> getMagias() {
        return magias;
    }

    @Override
    public String toString() {
        return "Personagem [armaPrincipal=" + armaPrincipal + ", armaSecundaria=" + armaSecundaria + ", armadura="
                + armadura + ", escudo=" + escudo + ", level=" + level + ", magias=" + magias + ", nome=" + nome
                + ", roupao=" + roupao + ", tipo=" + tipo + "]";
    }

}