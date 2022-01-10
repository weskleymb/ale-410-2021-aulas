package repositorio;

import modelo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepositorio implements RepositorioGenerico<Pessoa> {

    private static List<Pessoa> repositorio = new ArrayList<Pessoa>();

    @Override
    public void salvar(Pessoa objeto) {

    }

    @Override
    public void remover(Pessoa objeto) {

    }

    @Override
    public void alterar(Pessoa objeto) {

    }
}
