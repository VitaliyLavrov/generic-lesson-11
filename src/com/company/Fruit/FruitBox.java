package com.company.Fruit;

import java.util.ArrayList;

public class FruitBox<T extends Fruit> {
    private ArrayList<Fruit> container = new ArrayList<>();

    public FruitBox(T... fruits) {
        for (int i = 0; i < fruits.length; i++) {
            container.add(fruits[i]);
        }

    }

    // Сделать метод getWeight(), который высчитывает вес коробки,
    // зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f
    // (единицы измерения не важны);
    public double getWeight() {
        if (this.container.isEmpty()){ System.out.println("пусто"); return 0.0;
        }else   return (container.get(0).getWeight() * container.size());
    }

    // Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
    // которую подадут в compare() в качестве параметра. true – если их массы равны,
    // false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
    public boolean compare(FruitBox anotherBox) {
        return (this.getWeight() - anotherBox.getWeight() == 0.0);
    }
    //Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    //Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    // Соответственно, в текущей коробке фруктов не остается,
    // а в другую перекидываются объекты, которые были в первой;

    public void transferFruits(FruitBox<T> anotherBox){
        anotherBox.container.addAll(this.container);
        this.container.clear();

    }
        public   void addFruit(T fruit){
        if (true) {
            this.container.add(fruit);
        }
    }
}
