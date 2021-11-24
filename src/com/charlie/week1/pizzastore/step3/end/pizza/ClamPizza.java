package com.charlie.week1.pizzastore.step3.end.pizza;

import com.charlie.week1.pizzastore.step3.end.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

  private PizzaIngredientFactory ingredientFactory;

  public ClamPizza(final PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  @Override
  public void prepare() {
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    clams = ingredientFactory.createClam();
  }

}
