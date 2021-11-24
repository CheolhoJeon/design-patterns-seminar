package com.charlie.week1.pizzastore.step3.end.store;

import com.charlie.week1.pizzastore.step3.end.factory.NYPizzaIngredientFactory;
import com.charlie.week1.pizzastore.step3.end.factory.PizzaIngredientFactory;
import com.charlie.week1.pizzastore.step3.end.pizza.CheesePizza;
import com.charlie.week1.pizzastore.step3.end.pizza.ClamPizza;
import com.charlie.week1.pizzastore.step3.end.pizza.PepperoniPizza;
import com.charlie.week1.pizzastore.step3.end.pizza.Pizza;
import com.charlie.week1.pizzastore.step3.end.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {

  @Override
  protected Pizza createPizza(String type) {
    Pizza pizza;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    if (type.equals("cheese")) {
      pizza = new CheesePizza(ingredientFactory);
    } else if (type.equals("veggie")) {
      pizza = new VeggiePizza(ingredientFactory);
    } else if (type.equals("clam")) {
      pizza = new ClamPizza(ingredientFactory);
    } else {
      pizza = new PepperoniPizza(ingredientFactory);
    }

    return pizza;
  }

}
