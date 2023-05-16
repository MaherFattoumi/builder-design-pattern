package com.mf.builder.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.mf.builder.CustomPizzaBuilder;
import com.mf.builder.Pizza;

class PizzaBuilderTest {
    @Test
    void testBuildCustomPizza() {
        CustomPizzaBuilder builder = new CustomPizzaBuilder();

        Pizza pizza = builder.setSize("Large")
                .setCheese(true)
                .setTomato(true)
                .setPepperoni(true)
                .build();

        assertEquals("Large", pizza.getSize());
        assertTrue(pizza.hasCheese());
        assertTrue(pizza.hasTomato());
        assertTrue(pizza.hasPepperoni());
    }
}