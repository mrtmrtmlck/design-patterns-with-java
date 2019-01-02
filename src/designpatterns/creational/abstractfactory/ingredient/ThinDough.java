package designpatterns.creational.abstractfactory.ingredient;

public class ThinDough implements IDough {
    @Override
    public String getDoughType() {
        return "Italian style thin dough";
    }
}
