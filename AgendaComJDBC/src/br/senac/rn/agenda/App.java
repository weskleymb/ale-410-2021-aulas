package br.senac.rn.agenda;

import br.senac.rn.agenda.dao.ContatoRepositorio;
import br.senac.rn.agenda.dominio.Contato;

public class App {

    public static void main(String[] args) {
        System.out.println("Minha agenda");

        ContatoRepositorio repositorio = new ContatoRepositorio();
//        System.out.println(repositorio.selectByPK(1));
//        repositorio.

        Contato weskley = new Contato("chico tripa", "84996753679");
        repositorio.save(weskley);

        System.out.println(repositorio.selectAll());
    }

}
