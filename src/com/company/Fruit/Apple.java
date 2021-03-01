package com.company.Fruit;

public class Apple extends Fruit {
    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public void setWeight(double weight) {
        super.setWeight(weight);
    }

    public Apple(double weight) {
        super(weight);
    }

    public Apple() {
        super(1.0);
    }
}
