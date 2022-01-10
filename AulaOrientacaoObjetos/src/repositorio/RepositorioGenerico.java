package repositorio;

public interface RepositorioGenerico<T> {

    void salvar(T objeto);

    void remover(T objeto);

    void alterar(T objeto);

}
