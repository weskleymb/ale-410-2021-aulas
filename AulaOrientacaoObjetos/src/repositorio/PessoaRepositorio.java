package repositorio;

import modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepositorio implements RepositorioGenerico<Pessoa> {

    private static List<Pessoa> repositorio = new ArrayList<Pessoa>();

    @Override
    public void salvar(Pessoa objeto) {
        repositorio.add(objeto);
    }

    @Override
    public void remover(Pessoa objeto) {
        repositorio.remove(objeto);
    }

    @Override
    public void alterar(Pessoa objeto) {
        Pessoa clienteAntigo = buscarPorNome(objeto.getNome());
        if (clienteAntigo != null) {
            Integer indice = repositorio.indexOf(clienteAntigo);
            repositorio.set(indice, objeto);
        }
    }

    public Pessoa buscarPorNome(String nome) {
        for (Pessoa cliente : repositorio) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    public List<Pessoa> buscarTodos() {
        return new ArrayList<Pessoa>(repositorio);
    }


}
