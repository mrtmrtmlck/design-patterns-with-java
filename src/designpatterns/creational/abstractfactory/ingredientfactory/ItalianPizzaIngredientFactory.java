package designpatterns.creational.abstractfactory.ingredientfactory;

import designpatterns.creational.abstractfactory.ingredient.*;

public class ItalianPizzaIngredientFactory implements IPizzaIngredientFactory {
    @Override
    public IDough createDough() {
        return new ThinDough();
    }

    @Override
    public ICheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public ISauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public IClams createClam() {
        return new FreshClams();
    }
}
