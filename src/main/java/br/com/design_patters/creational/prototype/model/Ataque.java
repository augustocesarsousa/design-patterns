package main.java.br.com.design_patters.creational.prototype.model;

/**
 * Magia
 */
public class Ataque implements Cloneable {

  private String nome;
  private String descricao;

  public Ataque(String nome, String descricao) {
    this.nome = nome;
    this.descricao = descricao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  protected Ataque clone() throws CloneNotSupportedException {
    return (Ataque) super.clone();
  }

  @Override
  public String toString() {
    return "[descricao=" + descricao + ", nome=" + nome + "]";
  }
}
