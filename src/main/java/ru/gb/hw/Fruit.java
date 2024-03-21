package ru.gb.hw;

public abstract class Fruit {
    protected float weight;

    private Fruit() {
    }

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
