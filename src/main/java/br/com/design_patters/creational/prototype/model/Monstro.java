package main.java.br.com.design_patters.creational.prototype.model;

/**
 * Monstro
 */
public class Monstro implements Cloneable {

  private String nome;
  private String porte;
  private String habitat;
  private String classe;
  private Integer level;
  private String arma;
  private Ataque ataque;

  public Monstro(
    String nome,
    String porte,
    String habitat,
    String classe,
    Integer level,
    String arma,
    Ataque ataque
  ) {
    this.nome = nome;
    this.porte = porte;
    this.habitat = habitat;
    this.classe = classe;
    this.level = level;
    this.arma = arma;
    this.ataque = ataque;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getPorte() {
    return porte;
  }

  public void setPorte(String porte) {
    this.porte = porte;
  }

  public String getHabitat() {
    return habitat;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  public String getClasse() {
    return classe;
  }

  public void setClasse(String classe) {
    this.classe = classe;
  }

  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  public String getArma() {
    return arma;
  }

  public void setArma(String arma) {
    this.arma = arma;
  }

  public Ataque getAtaque() {
    return ataque;
  }

  public void setAtaque(Ataque ataque) {
    this.ataque = ataque;
  }

  @Override
  public Monstro clone() throws CloneNotSupportedException {
    Monstro monstroClone = (Monstro) super.clone();
    monstroClone.ataque = (Ataque) ataque.clone();
    return monstroClone;
  }

  @Override
  public String toString() {
    return (
      "Monstro [arma=" +
      arma +
      ", ataque=" +
      ataque +
      ", classe=" +
      classe +
      ", habitat=" +
      habitat +
      ", level=" +
      level +
      ", nome=" +
      nome +
      ", porte=" +
      porte +
      "]"
    );
  }
}
