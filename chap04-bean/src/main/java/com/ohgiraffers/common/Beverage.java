package com.ohgiraffers.common;

public class Beverage extends Product{

    private int capacity; // 용량


    public Beverage(String name, int price, int capacity) {
        super(name, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Beverage{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", capacity=" + capacity +
                '}';
    }
}


