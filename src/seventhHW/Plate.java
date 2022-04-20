package seventhHW;

public class Plate {
    private int foodAmount;

    public Plate(int amount) {
        foodAmount = amount;
    }

    public boolean eatFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        foodAmount += amount;
    }
}

