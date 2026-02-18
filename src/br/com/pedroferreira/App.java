package br.com.pedroferreira;

import br.com.pedroferreira.Domain.Atletas;
import br.com.pedroferreira.Domain.GetValor;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Pedro Ferreira
 */

public class App {

  static void main(String[] args) {
    GetValor gv = new GetValor();

    Set<Atletas> atletasLista = gv.cadastrarAtleta();

    System.out.println("Atletas: ");
    atletasLista.forEach(System.out::println);
    System.out.println("**************");

    Set<Atletas> atletasF = atletasLista.stream()
            .filter(a -> a.getSexo().equalsIgnoreCase("F"))
            .collect(Collectors.toSet());
    System.out.println("Atletas Feminino: ");
    atletasF.forEach(System.out::println);

  }
}
