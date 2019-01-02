package designpatterns.creational.factorymethod;

/**
 * This is an concrete Product class. It overrides getProductInfo method for Phone.
 */
public class Phone extends Product {
    Phone(String manufacturer) {
        super(manufacturer);
    }

    @Override
    public String getProductInfo() {
        return "This phone was manufactured by " + manufacturer;
    }
}
