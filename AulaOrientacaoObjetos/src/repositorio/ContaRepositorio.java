package repositorio;

import modelo.ContaGenerica;

import java.util.ArrayList;
import java.util.List;

public class ContaRepositorio implements RepositorioGenerico<ContaGenerica> {

    private static List<ContaGenerica> repositorio = new ArrayList<ContaGenerica>();

    @Override
    public void salvar(ContaGenerica objeto) {
        repositorio.add(objeto);
    }

    @Override
    public void remover(ContaGenerica objeto) {

    }

    @Override
    public void alterar(ContaGenerica objeto) {

    }

    @Override
    public List<ContaGenerica> buscarTodos() {
        return new ArrayList<ContaGenerica>(repositorio);
    }

}
