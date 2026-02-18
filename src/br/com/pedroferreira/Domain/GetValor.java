package br.com.pedroferreira.Domain;

import java.util.*;

/**
 * @author Pedro Ferreira
 */

public class GetValor {
  private Scanner sc;

  public GetValor(){sc = new Scanner(System.in);}

  public Set<Atletas> cadastrarAtleta(){
    Set<Atletas> atletasList = new HashSet<>();

    System.out.println("Digite o nome e o sexo dos atletas separando por virgula os atletas a cadastrar(pedro M, Ana F): ");
    String atletaInscrito = sc.nextLine();
    String[] atletasArray = atletaInscrito.split(",");

    Arrays.stream(atletasArray)
          .map(String::trim)
          .forEach(atl -> {
            String dados[] = atl.split(" ");
            String nome = dados[0];
            String sexo = dados[1];

            atletasList.add(new Atletas(nome, sexo));
          });

    return atletasList;

   }
}
