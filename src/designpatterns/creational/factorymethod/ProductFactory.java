package designpatterns.creational.factorymethod;

/**
 * This is the base factory class. This class doesn't know which type of product
 * it deals with. It is decoupled from concrete product factories.
 */
public abstract class ProductFactory {

    public void displayProductInfo(String manufacturer) {
        var product = makeProduct(manufacturer);
        var productInfo = product.getProductInfo();
        System.out.println(productInfo);
    }

    protected abstract Product makeProduct(String manufacturer);
}
