package dev.mrcabbagestick.ingredients;

public class Cheese {
    private final CheeseType type;

    public Cheese(CheeseType type) {
        this.type = type;
    }

    public CheeseType getType() {
        return type;
    }

    public enum CheeseType{
        AmericanCheese("American cheese"),
        GoatCheese("Goat cheese"),
        CottageCheese("Cottage cheese");

        public final String string;

        CheeseType(String string) {
            this.string = string;
        }
    }
}
