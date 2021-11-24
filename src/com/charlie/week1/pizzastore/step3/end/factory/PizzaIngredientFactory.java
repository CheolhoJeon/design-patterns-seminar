package com.charlie.week1.pizzastore.step3.end.factory;

import com.charlie.week1.pizzastore.step3.end.ingredient.cheese.Cheese;
import com.charlie.week1.pizzastore.step3.end.ingredient.clam.Clams;
import com.charlie.week1.pizzastore.step3.end.ingredient.dough.Dough;
import com.charlie.week1.pizzastore.step3.end.ingredient.pepperoni.Pepperoni;
import com.charlie.week1.pizzastore.step3.end.ingredient.sauce.Sauce;
import com.charlie.week1.pizzastore.step3.end.ingredient.veggie.Veggie;

public interface PizzaIngredientFactory {

  Sauce createSauce();

  Cheese createCheese();

  Dough createDough();

  Veggie createVeggie();

  Clams createClam();

  Pepperoni createPepperoni();

}
