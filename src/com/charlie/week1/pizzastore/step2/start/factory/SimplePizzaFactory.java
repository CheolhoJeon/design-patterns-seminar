package com.charlie.week1.pizzastore.step2.start.factory;

import com.charlie.week1.pizzastore.step1.end.pizza.CheesePizza;
import com.charlie.week1.pizzastore.step1.end.pizza.PepperoniPizza;
import com.charlie.week1.pizzastore.step1.end.pizza.Pizza;
import com.charlie.week1.pizzastore.step1.end.pizza.VeggiePizza;

public class SimplePizzaFactory {

  public Pizza createPizza(String type) {
    Pizza pizza;

    if (type.equals("cheese")) {
      pizza = new CheesePizza();
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizza();
    } else {
      pizza = new PepperoniPizza();
    }

    return pizza;
  }

}
