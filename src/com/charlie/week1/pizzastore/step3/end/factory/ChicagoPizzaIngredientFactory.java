package com.charlie.week1.pizzastore.step3.end.factory;

import com.charlie.week1.pizzastore.step3.end.ingredient.cheese.Cheese;
import com.charlie.week1.pizzastore.step3.end.ingredient.cheese.MozzarellaCheese;
import com.charlie.week1.pizzastore.step3.end.ingredient.clam.Clams;
import com.charlie.week1.pizzastore.step3.end.ingredient.clam.FrozenClam;
import com.charlie.week1.pizzastore.step3.end.ingredient.dough.Dough;
import com.charlie.week1.pizzastore.step3.end.ingredient.dough.ThickCrustDough;
import com.charlie.week1.pizzastore.step3.end.ingredient.pepperoni.Pepperoni;
import com.charlie.week1.pizzastore.step3.end.ingredient.pepperoni.SlicedPepperoni;
import com.charlie.week1.pizzastore.step3.end.ingredient.sauce.PlumTomatoSauce;
import com.charlie.week1.pizzastore.step3.end.ingredient.sauce.Sauce;
import com.charlie.week1.pizzastore.step3.end.ingredient.veggie.RedPepper;
import com.charlie.week1.pizzastore.step3.end.ingredient.veggie.Veggie;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
  @Override
  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  @Override
  public Dough createDough() {
    return new ThickCrustDough();
  }

  @Override
  public Veggie createVeggie() {
    return new RedPepper();
  }

  @Override
  public Clams createClam() {
    return new FrozenClam();
  }

  @Override
  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }
}
