package com.mf.builder;

public class Pizza {
    private String size;
    private boolean hasCheese;
    private boolean hasTomato;
    private boolean hasPepperoni;

    public Pizza(String size, boolean hasCheese, boolean hasTomato, boolean hasPepperoni) {
        this.size = size;
        this.hasCheese = hasCheese;
        this.hasTomato = hasTomato;
        this.hasPepperoni = hasPepperoni;
    }

    public String getSize() {
        return size;
    }

    public boolean hasCheese() {
        return hasCheese;
    }

    public boolean hasTomato() {
        return hasTomato;
    }

    public boolean hasPepperoni() {
        return hasPepperoni;
    }
}
