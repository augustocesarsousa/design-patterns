package main.java.br.com.design_patters.creational.builder;

import java.util.Arrays;

import main.java.br.com.design_patters.creational.builder.builder.PersonagemBuilder;
import main.java.br.com.design_patters.creational.builder.enuns.Tipo;
import main.java.br.com.design_patters.creational.builder.model.Personagem;

public class Client {
    public static void main(String[] args) {
        Personagem personagem1 = new PersonagemBuilder("Légolas", Tipo.ARQUEIRO)
                .armaPrincipal("Arvo Leve")
                .armaSecundaria("Espada Leve")
                .armadura("Armadura Leve")
                .magias(Arrays.asList("Flecha de Vento", "Esgrima Élfica"))
                .criar();

        Personagem personagem2 = new PersonagemBuilder("Giblin", Tipo.GUERREIRO)
                .armaPrincipal("Martelo Pesado")
                .armaSecundaria("Machado de Bronze")
                .armadura("Armadura Pesada")
                .escudo("Escudo de Bronze")
                .magias(Arrays.asList("Quebra Crânio", "Fúria"))
                .criar();

        Personagem personagem3 = new PersonagemBuilder("Gandalf", Tipo.MAGO)
                .armaPrincipal("Cajado Mágico")
                .armaSecundaria("Espada Longa")
                .roupao("Roupão de Batalha")
                .magias(Arrays.asList("Bola de Fogo", "Iluminar"))
                .criar();

        System.out.println(personagem1 + "\n");
        System.out.println(personagem2 + "\n");
        System.out.println(personagem3 + "\n");
    }
}
