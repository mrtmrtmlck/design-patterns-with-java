package designpatterns.creational.abstractfactory.pizza;


import designpatterns.creational.abstractfactory.ingredient.ICheese;
import designpatterns.creational.abstractfactory.ingredient.IClams;
import designpatterns.creational.abstractfactory.ingredient.IDough;
import designpatterns.creational.abstractfactory.ingredient.ISauce;

public abstract class Pizza {
    private String name;
    private IDough dough;
    private ISauce sauce;
    private ICheese cheese;
    private IClams clams;

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

    void setSauce(ISauce sauce) {
        this.sauce = sauce;
    }

    void setCheese(ICheese cheese) {
        this.cheese = cheese;
    }

    void setClams(IClams clams) {
        this.clams = clams;
    }

    @Override
    public String toString() {
        var output = "Pizza Ready: " +
                "name => " + name +
                ", ingredients => " + dough.getDoughType() + ", " + sauce.getSauceType() + ", " +
                cheese.getCheeseType();
        if (clams != null) {
            output += ", " + clams.getClamType();
        }

        return output;
    }
}
