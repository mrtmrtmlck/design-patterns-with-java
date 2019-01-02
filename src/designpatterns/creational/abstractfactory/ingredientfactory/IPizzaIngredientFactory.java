package designpatterns.creational.abstractfactory.ingredientfactory;

import designpatterns.creational.abstractfactory.ingredient.ICheese;
import designpatterns.creational.abstractfactory.ingredient.IDough;

public interface IPizzaIngredientFactory {
    IDough createDough();

    ICheese createCheese();
}
