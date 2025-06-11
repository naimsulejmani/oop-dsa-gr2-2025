package oop.generics.db_sample;

public class Consumer {
    private long id;
    private String name;

    public Consumer(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Consumer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
