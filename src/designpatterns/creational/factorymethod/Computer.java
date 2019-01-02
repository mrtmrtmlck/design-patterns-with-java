package designpatterns.creational.factorymethod;

/**
 * This is an concrete Product class. It overrides getProductInfo method for Computer.
 */
public class Computer extends Product {
    Computer(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public String getProductInfo() {
        return "This computer was manufactured by " + manufacturer;
    }
}
