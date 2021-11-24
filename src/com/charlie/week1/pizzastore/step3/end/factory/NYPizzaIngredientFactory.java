package com.charlie.week1.pizzastore.step3.end.factory;

import com.charlie.week1.pizzastore.step3.end.ingredient.cheese.Cheese;
import com.charlie.week1.pizzastore.step3.end.ingredient.cheese.ReggianoCheese;
import com.charlie.week1.pizzastore.step3.end.ingredient.clam.Clams;
import com.charlie.week1.pizzastore.step3.end.ingredient.clam.FreshClam;
import com.charlie.week1.pizzastore.step3.end.ingredient.dough.Dough;
import com.charlie.week1.pizzastore.step3.end.ingredient.dough.ThinCrustDough;
import com.charlie.week1.pizzastore.step3.end.ingredient.pepperoni.Pepperoni;
import com.charlie.week1.pizzastore.step3.end.ingredient.pepperoni.SlicedPepperoni;
import com.charlie.week1.pizzastore.step3.end.ingredient.sauce.PlumTomatoSauce;
import com.charlie.week1.pizzastore.step3.end.ingredient.sauce.Sauce;
import com.charlie.week1.pizzastore.step3.end.ingredient.veggie.Onion;
import com.charlie.week1.pizzastore.step3.end.ingredient.veggie.Veggie;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  @Override
  public Dough createDough() {
    return new ThinCrustDough();
  }

  @Override
  public Veggie createVeggie() {
    return new Onion();
  }

  @Override
  public Clams createClam() {
    return new FreshClam();
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
}
