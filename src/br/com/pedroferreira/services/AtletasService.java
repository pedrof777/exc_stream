package br.com.pedroferreira.services;

import br.com.pedroferreira.Domain.Atletas;

import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Pedro Ferreira
 */

public class AtletasService {
  private GetValor gv;

  public AtletasService(GetValor g){
    this.gv = gv;
  }

  public Set<Atletas> buscarAtletasF(Set<Atletas> atletaList){
    return atletaList.stream()
            .filter(atletasf -> atletasf.getSexo().equalsIgnoreCase("F"))
            .collect(Collectors.toSet());
  }
}
