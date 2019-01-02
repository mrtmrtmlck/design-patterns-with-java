package designpatterns;

import designpatterns.creational.abstractfactory.pizzastore.AmericanPizzaStore;
import designpatterns.creational.abstractfactory.pizzastore.ItalianPizzaStore;
import designpatterns.creational.abstractfactory.enums.PizzaType;
import designpatterns.creational.factorymethod.ComputerProductFactory;
import designpatterns.creational.factorymethod.PhoneProductFactory;
import designpatterns.creational.singleton.Singleton;
import designpatterns.creational.singleton.ThreadSafeSingleton;

public class Main {
    public static void main(String[] args) {
        naiveSingleton();
        threadSafeSingleton();
        factoryMethod();
        abstractFactory();
    }

    private static void abstractFactory() {
        System.out.println("\n*** Abstract Factory ***");
        var americanPizzaStore = new AmericanPizzaStore();
        var americanPizza = americanPizzaStore.orderPizza(PizzaType.Cheese);
        System.out.println(americanPizza.toString());
        System.out.println("\n");
        var italianPizzaStore = new ItalianPizzaStore();
        var italianPizza = italianPizzaStore.orderPizza(PizzaType.Cheese);
        System.out.println(italianPizza.toString());
    }

    private static void naiveSingleton() {
        // Although two different instances were created from singleton class they are actually EXACTLY THE SAME
        // which means both of their value is FOO
        var firstInstance = Singleton.getInstance("FOO");
        var secondInstance = Singleton.getInstance("BAR");
        System.out.println("\n*** Naive Singleton ***");
        System.out.println("First Instance: " + firstInstance.value);
        System.out.println("Second Instance: " + secondInstance.value);
    }

    private static void threadSafeSingleton() {
        System.out.println("\n*** Thread-Safe Singleton ***");
        var threadFoo = new ThreadFoo();
        var threadBar = new ThreadBar();
        threadFoo.run();
        threadBar.run();
    }

    private static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance("FOO");
            System.out.println("First Thread: " + threadSafeSingleton.value);
        }
    }

    private static class ThreadBar implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance("BAR");
            System.out.println("Second Thread: " + threadSafeSingleton.value);
        }
    }

    private static void factoryMethod() {
        System.out.println("\n*** Factory Method ***");

        // create a Computer product(manufactured by Dell).
        var computerFactory = new ComputerProductFactory();
        computerFactory.displayProductInfo("Dell");

        // create a Phone product(manufactured by Apple).
        var phoneFactory = new PhoneProductFactory();
        phoneFactory.displayProductInfo("Apple");
    }
}
