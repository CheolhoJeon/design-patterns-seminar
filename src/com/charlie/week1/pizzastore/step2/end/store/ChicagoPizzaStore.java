package com.charlie.week1.pizzastore.step2.end.store;

import com.charlie.week1.pizzastore.step2.end.pizza.ChicagoStyleCheesePizza;
import com.charlie.week1.pizzastore.step2.end.pizza.ChicagoStyleClamPizza;
import com.charlie.week1.pizzastore.step2.end.pizza.ChicagoStylePepperoniPizza;
import com.charlie.week1.pizzastore.step2.end.pizza.ChicagoStyleVeggiePizza;
import com.charlie.week1.pizzastore.step2.end.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza;

    if (type.equals("cheese")) {
      pizza = new ChicagoStyleCheesePizza();
    } else if (type.equals("veggie")) {
      pizza = new ChicagoStyleVeggiePizza();
    } else if (type.equals("clam")) {
      pizza = new ChicagoStyleClamPizza();
    } else {
      pizza = new ChicagoStylePepperoniPizza();
    }

    return pizza;
  }

}
