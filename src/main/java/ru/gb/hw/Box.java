package ru.gb.hw;

import java.util.ArrayList;

/**
 * Коробка предназнаяенная для хранения фруктов
 * @param <T>
 */
public class Box<T extends Fruit> {
    private final T fruit;
    private ArrayList<T> fruits = new ArrayList<>();
    private float weight;

    /**
     * Добавление фрукта к коробку
     * @param fruit
     */
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    public Box(T fruit) {
        this.fruit = fruit;
    }

    /**
     * Подсчет веса коробки
     * @return вес коробки
     */
    public float getBoxWeight() {
        return fruit.getWeight() * fruits.size();
    }

    /**
     * Сравение веса коробок
     * @param otherBox коробка для сравнения
     * @return true если вес коробок одинаковый
     */
    public boolean compare(Box<?> otherBox) {
        if (otherBox == null) {
            return false;
        }
        return this.getBoxWeight() == otherBox.getBoxWeight();
    }

    /**
     * Пересыпание фруктов в другую коробку;
     * @param anotherBox коробка предназначенная для фруктов
     */
    public void transferFruits(Box<T> anotherBox) {
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
