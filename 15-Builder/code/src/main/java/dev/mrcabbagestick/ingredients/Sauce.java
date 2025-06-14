package dev.mrcabbagestick.ingredients;

public class Sauce {
    private final SauceType type;

    public Sauce(SauceType type) {
        this.type = type;
    }

    public SauceType getType() {
        return type;
    }

    public enum SauceType{
        Mustard("Mustard"),
        Ketchup("Ketchup"),
        Mayo("Mayo");

        public final String string;

        SauceType(String string) {
            this.string = string;
        }
    }
}
