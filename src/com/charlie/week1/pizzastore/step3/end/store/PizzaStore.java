package com.charlie.week1.pizzastore.step3.end.store;


import com.charlie.week1.pizzastore.step3.end.pizza.Pizza;

public abstract class PizzaStore {
  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

  protected abstract Pizza createPizza(String type);

}
