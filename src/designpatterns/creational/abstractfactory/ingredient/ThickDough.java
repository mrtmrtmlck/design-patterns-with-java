package designpatterns.creational.abstractfactory.ingredient;

public class ThickDough implements IDough {
    @Override
    public String getDoughType() {
        return "American style thick dough";
    }
}
