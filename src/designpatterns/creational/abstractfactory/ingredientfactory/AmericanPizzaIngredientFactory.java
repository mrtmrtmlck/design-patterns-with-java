package designpatterns.creational.abstractfactory.ingredientfactory;

import designpatterns.creational.abstractfactory.ingredient.*;

public class AmericanPizzaIngredientFactory implements IPizzaIngredientFactory {
    @Override
    public IDough createDough() {
        return new ThickDough();
    }

    @Override
    public ICheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public ISauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public IClams createClam() {
        return new FrozenClams();
    }
}
