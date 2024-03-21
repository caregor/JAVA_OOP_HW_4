package ru.gb.hw;
/**
 Домашняя работа, задача:
 ========================

 + a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
 +b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 + c. Для хранения фруктов внутри коробки можно использовать ArrayList;
 +d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
 вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
 +e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
 подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
 Можно сравнивать коробки с яблоками и апельсинами;
 +f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
 Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
 Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
 g. Не забываем про метод добавления фрукта в коробку.
 */
public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(new Apple());
        Box<Orange>orangeBox = new Box<>(new Orange());
        Box<Apple> appleBox2 = new Box<>(new Apple());


        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        //appleBox.addFruit(new Apple());

        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        if (orangeBox.compare(appleBox)) {
            System.out.println("Вес коробок одинаковый");
        }
        else {
            System.out.println("Вес коробки с апельсинами: " + orangeBox.getBoxWeight());
            System.out.println("Вес коробки с яблоками: " + appleBox.getBoxWeight());
        }
        appleBox.transferFruits(appleBox2);
       // orangeBox.transferFruits(appleBox2);
        System.out.println("Вес коробки applBox: " + appleBox.getBoxWeight());
        System.out.println("Вес коробки applBox2: " + appleBox2.getBoxWeight());
    }
}