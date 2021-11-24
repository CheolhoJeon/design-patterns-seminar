package com.charlie.week1.pizzastore.step3.start.store;

import com.charlie.week1.pizzastore.step2.end.pizza.NYStyleCheesePizza;
import com.charlie.week1.pizzastore.step2.end.pizza.NYStyleClamPizza;
import com.charlie.week1.pizzastore.step2.end.pizza.NYStylePepperoniPizza;
import com.charlie.week1.pizzastore.step2.end.pizza.NYStyleVeggiePizza;
import com.charlie.week1.pizzastore.step2.end.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza;

    if (type.equals("cheese")) {
      pizza = new NYStyleCheesePizza();
    } else if (type.equals("veggie")) {
      pizza = new NYStyleVeggiePizza();
    } else if (type.equals("clam")) {
      pizza = new NYStyleClamPizza();
    } else {
      pizza = new NYStylePepperoniPizza();
    }

    return pizza;
  }

}
