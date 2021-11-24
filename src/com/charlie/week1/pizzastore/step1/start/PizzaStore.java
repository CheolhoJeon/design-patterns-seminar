package com.charlie.week1.pizzastore.step1.start;

import com.charlie.week1.pizzastore.step1.start.pizza.CheesePizza;
import com.charlie.week1.pizzastore.step1.start.pizza.PepperoniPizza;
import com.charlie.week1.pizzastore.step1.start.pizza.Pizza;
import com.charlie.week1.pizzastore.step1.start.pizza.VeggiePizza;

public class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza;

    if (type.equals("cheese")) {
      pizza = new CheesePizza();
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizza();
    } else {
      pizza = new PepperoniPizza();
    }

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return pizza;
  }

}
