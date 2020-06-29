package Factory;

public class CarFactory {
    public Car buildCar(CarType model) {
        switch (model) {
            case SMALL:
                return new SmallCar();
            case SEDAN:
                return new SedanCar();
            case LUXURY:
                return new LuxuryCar();
            default:
                return new Car(model);
        }
    }
}