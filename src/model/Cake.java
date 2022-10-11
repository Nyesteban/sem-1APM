package model;

public class Cake extends Entity {

    private String flavour;

    public Cake(String flavour, int weight) {
        this.flavour = flavour;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "flavour='" + flavour + '\'' +
                ", weight=" + weight +
                '}';
    }
}
