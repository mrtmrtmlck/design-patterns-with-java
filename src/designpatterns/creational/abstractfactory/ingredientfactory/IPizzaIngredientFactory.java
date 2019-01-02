package designpatterns.creational.abstractfactory.ingredientfactory;

import designpatterns.creational.abstractfactory.ingredient.ICheese;
import designpatterns.creational.abstractfactory.ingredient.IClams;
import designpatterns.creational.abstractfactory.ingredient.IDough;
import designpatterns.creational.abstractfactory.ingredient.ISauce;

public interface IPizzaIngredientFactory {
    IDough createDough();

    ICheese createCheese();

    ISauce createSauce();

    IClams createClam();
}
