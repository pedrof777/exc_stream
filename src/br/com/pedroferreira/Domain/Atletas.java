package br.com.pedroferreira.Domain;

import java.util.Objects;

/**
 * @author Pedro Ferreira
 */

public class Atletas {
  private String nome;
  private String sexo;

  public Atletas(){}

  public Atletas(String nome, String sexo) {
    this.nome = nome;
    this.sexo = sexo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Atletas atletas = (Atletas) o;
    return Objects.equals(nome, atletas.nome) && Objects.equals(sexo, atletas.sexo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, sexo);
  }

  @Override
  public String toString() {
    return "Atleta: " +
            "nome= " + nome +
            " | sexo= " + sexo ;
  }
}
