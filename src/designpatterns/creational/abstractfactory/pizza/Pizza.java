package designpatterns.creational.abstractfactory.pizza;


import designpatterns.creational.abstractfactory.ingredient.ICheese;
import designpatterns.creational.abstractfactory.ingredient.IDough;

public abstract class Pizza {
    private String name;
    private IDough dough;
    private ICheese cheese;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setDough(IDough dough) {
        this.dough = dough;
    }

    void setCheese(ICheese cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "Pizza Ready: " +
                "name => " + name +
                ", dough => " + dough.getDoughType() +
                ", cheese => " + cheese.getCheeseType();
    }
}
