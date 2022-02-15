package br.senac.rn.agenda;

import br.senac.rn.agenda.dao.ContatoRepositorio;
import br.senac.rn.agenda.dominio.Contato;

public class App {

    public static void main(String[] args) {
        System.out.println("Minha agenda");

        ContatoRepositorio repositorio = new ContatoRepositorio();
//        System.out.println(repositorio.selectAll());

        Contato jonatas = new Contato("Jonatas", "84988559558");
        repositorio.insert(jonatas);
    }

}
