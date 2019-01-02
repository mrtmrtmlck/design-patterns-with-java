package designpatterns.creational.abstractfactory.pizza;

import designpatterns.creational.abstractfactory.ingredientfactory.IPizzaIngredientFactory;

public class ClamPizza extends Pizza {
    private IPizzaIngredientFactory ingredientFactory;

    public ClamPizza(IPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(ingredientFactory.createDough());
        setSauce(ingredientFactory.createSauce());
        setCheese(ingredientFactory.createCheese());
        setClams(ingredientFactory.createClam());
    }
}
