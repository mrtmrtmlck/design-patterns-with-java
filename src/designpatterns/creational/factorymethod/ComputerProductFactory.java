package designpatterns.creational.factorymethod;

/**
 * This is an concrete factory class which is responsible for
 * creating Product(Phone) instances
 */
public class ComputerProductFactory extends ProductFactory {
    @Override
    protected Product makeProduct(String manufacturer) {
        return new Computer(manufacturer);
    }
}
