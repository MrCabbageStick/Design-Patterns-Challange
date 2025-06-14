package dev.mrcabbagestick.ingredients;

public class Veggie {
    private final VeggieType type;

    public Veggie(VeggieType type) {
        this.type = type;
    }

    public VeggieType getType() {
        return type;
    }

    public enum VeggieType{
        Salad("Salad"),
        Tomato("Tomato"),
        Cucumber("Cucumber");

        public final String string;

        VeggieType(String string) {
            this.string = string;
        }
    }
}
