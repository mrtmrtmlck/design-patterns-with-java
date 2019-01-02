package designpatterns.creational.abstractfactory.ingredientfactory;

import designpatterns.creational.abstractfactory.ingredient.ICheese;
import designpatterns.creational.abstractfactory.ingredient.IDough;
import designpatterns.creational.abstractfactory.ingredient.MozzarellaCheese;
import designpatterns.creational.abstractfactory.ingredient.ThinDough;

public class ItalianPizzaIngredientFactory implements IPizzaIngredientFactory {
    @Override
    public IDough createDough() {
        return new ThinDough();
    }

    @Override
    public ICheese createCheese() {
        return new MozzarellaCheese();
    }
}
