package oop.generics.db_sample;

import java.util.List;

public class ConsumerRepository implements CrudRepository<Consumer, Long>{
    @Override
    public Consumer add(Consumer entity) {
        return null;
    }

    @Override
    public Consumer modify(Long id, Consumer entity) {
        return null;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }

    @Override
    public boolean remove(Consumer entity) {
        return false;
    }

    @Override
    public Consumer findById(Long id) {
        return null;
    }

    @Override
    public List<Consumer> findAll() {
        return List.of();
    }
}
