package Main;

import Builder.Meal;
import Builder.MealBuilder;
import Builder.MealDirector;
import Builder.SandwichMealBuilder;
import Factory.Car;
import Factory.CarFactory;
import Factory.CarType;
import Observer.HeadHunter;
import Observer.JobSeeker;
import Singleton.EagerSingleton;

public class Tarea {
    public static void main(String[] args) {
        System.out.println("Patron Builder: ");
        Builder();
        System.err.println("-----------------------");
        System.out.println("Patron Factory: ");
        Factory();
        System.err.println("-----------------------");
        System.out.println("Patron Observer");
        Observer();
        System.err.println("-----------------------");
        System.out.println("Singleton");
        Singleton();
        System.err.println("-----------------------");

    }

    public static void Builder() {
        MealBuilder b = new SandwichMealBuilder();
        MealDirector vendedor = new MealDirector();
        vendedor.makeMeal(b);
        Meal meal = b.getMeal();
        System.out.println(b.getMeal().toString());
    }

    public static void Factory() {
        CarFactory factory = new CarFactory();
        Car carrito = factory.buildCar(CarType.LUXURY);
    }

    public static void Observer() {
        HeadHunter hunter = new HeadHunter();
        JobSeeker seeker = new JobSeeker("Seeker");
        hunter.registerObserver(seeker);
        hunter.addJob("Trabajo disponible en Tesla");
    }

    public static void Singleton() {
        EagerSingleton s = EagerSingleton.getInstance();
        s.helloSingleton();
    }

}