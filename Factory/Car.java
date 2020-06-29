package Factory;

public class Car {
    private CarType model;

    public Car(CarType model) {
        this.model = model;
        construct();
    }

    protected void construct() {
        System.out.println("CAR");
    }

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}