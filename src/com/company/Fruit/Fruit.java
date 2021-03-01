package com.company.Fruit;

public  abstract class Fruit {

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Fruit(double weight) {
        this.weight = weight;
    }
}
