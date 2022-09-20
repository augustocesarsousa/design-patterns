package main.java.br.com.design_patters.creational.prototype;

import main.java.br.com.design_patters.creational.prototype.model.Ataque;
import main.java.br.com.design_patters.creational.prototype.model.Monstro;

public class Client {

  public static void main(String[] args) throws CloneNotSupportedException {
    Monstro monstro1 = new Monstro(
      "Globin",
      "Pequeno",
      "Caverna",
      "Soldado",
      5,
      "Lança Enferrujada",
      new Ataque("Estocada", "Desfere uma estocada com sua Lança Enferrujada")
    );

    System.out.println(monstro1);

    Monstro monstro2 = monstro1.clone();
    monstro2.setNome("Goblin Vermelho");
    monstro2.setClasse("Chefe");
    monstro2.setArma("Espada Enferrujada");
    monstro2.setLevel(10);
    monstro2.setAtaque(
      new Ataque(
        "Corte Vertical",
        "Desfere um corte vertical com sua Espada Enferrujada"
      )
    );

    System.out.println(monstro2);
  }
}
