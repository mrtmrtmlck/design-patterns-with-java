package designpatterns.creational.singleton;

public final class ThreadSafeSingleton {
    // threads reads the most recent instance value thanks to volatile keyword
    private static volatile ThreadSafeSingleton instance;
    public String value;

    private ThreadSafeSingleton(String value) {
        this.value = value;
    }

    public static ThreadSafeSingleton getInstance(String value) {
        if (instance == null) {
            // threads wait each other before entering synchronized block
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton(value);
                }
            }
        }

        return instance;
    }
}
