package Builder;

public class MealDirector {
    public Meal makeMeal(MealBuilder b){
        b.addDrink("Coca Cola");
        b.addSides("french fries");
        b.addOffer("0");
        b.setPrice(120.00);
        return b.getMeal();
    }
}