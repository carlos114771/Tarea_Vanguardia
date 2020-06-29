package Singleton;

public class EagerSingleton {

    private static volatile EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }
    public void helloSingleton(){
        System.out.println("Singleton here");
    }
    public static EagerSingleton getInstance() {
        return instance;
    }

}