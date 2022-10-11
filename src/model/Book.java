package model;

public class Book extends Entity {

    private int noPages;

    public Book(int noPages, int weight) {
        this.noPages = noPages;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Book{" +
                "noPages=" + noPages + '\'' +
                ", weight=" + weight +
                '}';
    }
}
