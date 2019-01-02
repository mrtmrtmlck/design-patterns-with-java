package designpatterns.creational.abstractfactory.pizza;

import designpatterns.creational.abstractfactory.ingredientfactory.IPizzaIngredientFactory;

public class CheesePizza extends Pizza {
    private IPizzaIngredientFactory ingredientFactory;

    public CheesePizza(IPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(ingredientFactory.createDough());
        setCheese(ingredientFactory.createCheese());
    }
}
