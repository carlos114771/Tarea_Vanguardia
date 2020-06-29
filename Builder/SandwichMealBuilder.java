
package Builder;

public class SandwichMealBuilder implements MealBuilder {

    private Meal meal = new Meal();

    @Override
    public void addSides(String side) {
        meal.setSides(side);
    }

    @Override
    public void addDrink(String drink) {
        meal.setDrink(drink);
    }

    @Override
    public void addSandwich(String sandwich) {
        meal.setSandwich(sandwich);
    }

    @Override
    public void addOffer(String offer) {
        meal.setOffer(offer);
    }

    @Override
    public Meal getMeal() {
        return meal;
    }

    @Override
    public void setPrice(double d) {
        meal.setPrice(d);
    }

}