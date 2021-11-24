package com.charlie.week1.pizzastore.step1.end;

import com.charlie.week1.pizzastore.step1.end.factory.SimplePizzaFactory;
import com.charlie.week1.pizzastore.step1.end.pizza.Pizza;

public class PizzaStore {
  private SimplePizzaFactory factory;

  public PizzaStore(final SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza orderPizza(String type) {
    Pizza pizza = factory.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

}
