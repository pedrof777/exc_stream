package br.com.pedroferreira;

import br.com.pedroferreira.Domain.Atletas;
import br.com.pedroferreira.services.AtletasService;
import br.com.pedroferreira.services.GetValor;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Pedro Ferreira
 */

public class App {

  static void main(String[] args) {
    GetValor gv = new GetValor();
    AtletasService ats = new AtletasService(gv);

    Set<Atletas> atletasLista = gv.cadastrarAtleta();
    System.out.println("Atletas: ");
    atletasLista.forEach(System.out::println);
    System.out.println("**************");

    Set<Atletas> atletasF = ats.buscarAtletasF(atletasLista);
    System.out.println("Atletas Feminino: ");
    atletasF.forEach(System.out::println);

  }
}
