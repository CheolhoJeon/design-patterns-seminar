package com.charlie.week1.pizzastore.step3.end.pizza;

import com.charlie.week1.pizzastore.step3.end.ingredient.cheese.Cheese;
import com.charlie.week1.pizzastore.step3.end.ingredient.clam.Clams;
import com.charlie.week1.pizzastore.step3.end.ingredient.dough.Dough;
import com.charlie.week1.pizzastore.step3.end.ingredient.pepperoni.Pepperoni;
import com.charlie.week1.pizzastore.step3.end.ingredient.sauce.Sauce;
import com.charlie.week1.pizzastore.step3.end.ingredient.veggie.Veggie;

public abstract class Pizza {
  String name;

  Dough dough;
  Sauce sauce;
  Clams clams;
  Cheese cheese;
  Veggie veggie;
  Pepperoni pepperoni;

  public abstract void prepare();

  public void bake() {
    System.out.println("Baking " + name);
  }

  public void cut() {
    System.out.println("Cutting " + name);
  }

  public void box() {
    System.out.println("Boxing " + name);
  }

  public String getName() {
    return name;
  }

}
