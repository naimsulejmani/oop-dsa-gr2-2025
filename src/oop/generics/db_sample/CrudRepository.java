package oop.generics.db_sample;

import java.util.List;

public interface CrudRepository<T, TId> {
    T add(T entity);

    T modify(TId id, T entity);

    boolean removeById(TId id);

    boolean remove(T entity);

    T findById(TId id);

    List<T> findAll();
}
