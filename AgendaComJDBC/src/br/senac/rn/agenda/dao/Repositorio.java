package br.senac.rn.agenda.dao;

import java.util.List;

public interface Repositorio<T, PK> {

    Boolean insert(T t);

    Boolean update(T t);

    Boolean delete(T t);

    Boolean deleteByPK(PK pk);

    List<T> selectAll();

    T selectByPK(PK pk);

}
