package repositorio;

import java.util.List;

public interface RepositorioGenerico<T> {

    void salvar(T objeto);

    void remover(T objeto);

    void alterar(T objeto);

    List<T> buscarTodos();

}
