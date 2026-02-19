package br.com.pferreira;

import br.com.pedroferreira.Domain.Atletas;
import br.com.pedroferreira.services.AtletasService;
import br.com.pedroferreira.services.GetValor;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Pedro Ferreira
 */

public class DeveRetornarAtletasF {
  @Test
  public void atetasF(){
    Atletas a1 = new Atletas("PEdro", "M");
    Atletas a2 = new Atletas("Ana", "F");
    Atletas a3 = new Atletas("Juli", "F");
    Atletas a4 = new Atletas("Pedro F", "M");

    Set<Atletas> listaAtletasMock = new HashSet<>();
    listaAtletasMock.add(a1);
    listaAtletasMock.add(a2);
    listaAtletasMock.add(a3);
    listaAtletasMock.add(a4);

    AtletasService ats = new AtletasService(new GetValor());

    Set<Atletas> atletasF = ats.buscarAtletasF(listaAtletasMock);

    Assert.assertTrue(atletasF.stream()
            .allMatch(atletas -> atletas.getSexo().equalsIgnoreCase("F")));

  }
}
