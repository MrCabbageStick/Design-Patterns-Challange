package dev.mrcabbagestick.ingredients;

public class Meat {
    private final MeatType type;

    public Meat(MeatType type) {
        this.type = type;
    }

    public MeatType getType() {
        return type;
    }

    public enum MeatType{
        SlicedHam("Sliced ham"),
        YesterdaysDinnerMeat("Yesterday's dinner meat");

        public final String string;

        MeatType(String string) {
            this.string = string;
        }
    }
}
