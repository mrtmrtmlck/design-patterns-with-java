package designpatterns.creational.abstractfactory.pizzastore;

import designpatterns.creational.abstractfactory.ingredientfactory.ItalianPizzaIngredientFactory;
import designpatterns.creational.abstractfactory.enums.PizzaType;
import designpatterns.creational.abstractfactory.pizza.CheesePizza;
import designpatterns.creational.abstractfactory.pizza.ClamPizza;
import designpatterns.creational.abstractfactory.pizza.Pizza;

public class ItalianPizzaStore extends PizzaStore {
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        var ingredientFactory = new ItalianPizzaIngredientFactory();
        switch (pizzaType) {
            case Cheese:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Italian Style Cheese Pizza");
                break;
            case Clam:
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Italian Style Clam Pizza");
                break;
        }

        return pizza;
    }
}
