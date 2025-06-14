package dev.mrcabbagestick.ingredients;

public class Bread {
    private final BreadType type;

    public Bread(BreadType type) {
        this.type = type;
    }

    public BreadType getType() {
        return type;
    }

    public enum BreadType{
        White("White"),
        Wholegrain("Wholegrain");

        public final String string;

        BreadType(String string) {
            this.string = string;
        }
    }
}
