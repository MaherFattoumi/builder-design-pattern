package com.mf.builder;

public class CustomPizzaBuilder implements PizzaBuilder {
    private String size;
    private boolean hasCheese;
    private boolean hasTomato;
    private boolean hasPepperoni;

    public CustomPizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public CustomPizzaBuilder setCheese(boolean hasCheese) {
        this.hasCheese = hasCheese;
        return this;
    }

    public CustomPizzaBuilder setTomato(boolean hasTomato) {
        this.hasTomato = hasTomato;
        return this;
    }

    public CustomPizzaBuilder setPepperoni(boolean hasPepperoni) {
        this.hasPepperoni = hasPepperoni;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(size, hasCheese, hasTomato, hasPepperoni);
    }
}
