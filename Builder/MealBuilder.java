package Builder;

public interface MealBuilder {

    public void addSides(String side);

    public void addDrink(String drink);

    public void addSandwich(String sandwich);

    public void addOffer(String offer);

    public Meal getMeal();

    public void setPrice(double d);
}