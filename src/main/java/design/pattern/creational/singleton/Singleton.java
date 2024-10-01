package design.pattern.creational.singleton;

public class Singleton {
    // Volatile keyword ensures that multiple threads handle the instance correctly
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {}

    // Public method to provide access to the singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                // Double-check to avoid multiple instantiations
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}

