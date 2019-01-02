package designpatterns.creational.abstractfactory.ingredientfactory;

import designpatterns.creational.abstractfactory.ingredient.ICheese;
import designpatterns.creational.abstractfactory.ingredient.IDough;
import designpatterns.creational.abstractfactory.ingredient.ReggianoCheese;
import designpatterns.creational.abstractfactory.ingredient.ThickDough;

public class AmericanPizzaIngredientFactory implements IPizzaIngredientFactory {
    @Override
    public IDough createDough() {
        return new ThickDough();
    }

    @Override
    public ICheese createCheese() {
        return new ReggianoCheese();
    }
}
