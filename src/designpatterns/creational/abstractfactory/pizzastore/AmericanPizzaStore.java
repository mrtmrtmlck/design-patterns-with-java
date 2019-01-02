package designpatterns.creational.abstractfactory.pizzastore;

import designpatterns.creational.abstractfactory.ingredientfactory.AmericanPizzaIngredientFactory;
import designpatterns.creational.abstractfactory.enums.PizzaType;
import designpatterns.creational.abstractfactory.pizza.CheesePizza;
import designpatterns.creational.abstractfactory.pizza.Pizza;

public class AmericanPizzaStore extends PizzaStore {
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        var ingredientFactory = new AmericanPizzaIngredientFactory();
        if (pizzaType == PizzaType.Cheese) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("American Style Cheese Pizza");
        }

        return pizza;
    }
}
