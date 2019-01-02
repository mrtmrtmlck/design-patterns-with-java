package designpatterns.creational.factorymethod;

/**
 * This is an concrete factory class which is responsible for
 * creating Product(Phone) instances
 */
public class PhoneProductFactory extends ProductFactory {
    @Override
    protected Product makeProduct(String manufacturer) {
        return new Phone(manufacturer);
    }
}
