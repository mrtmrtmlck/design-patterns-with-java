package designpatterns.creational.factorymethod;

/**
 * This is the base Product class for all Product type classes
 * getProductInfo method will be overridden by subclasses
 */
abstract class Product {
    String manufacturer;

    Product(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    abstract String getProductInfo();
}