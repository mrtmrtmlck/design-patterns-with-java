package designpatterns.creational.abstractfactory.pizzastore;

import designpatterns.creational.abstractfactory.enums.PizzaType;
import designpatterns.creational.abstractfactory.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);
}
