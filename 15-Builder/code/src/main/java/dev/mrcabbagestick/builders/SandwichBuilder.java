package dev.mrcabbagestick.builders;

import dev.mrcabbagestick.Sandwich;
import dev.mrcabbagestick.ingredients.*;

import java.util.ArrayList;
import java.util.List;

public abstract class SandwichBuilder {
    protected Bread bread = null;
    protected Meat meat = null;
    protected Cheese cheese = null;
    protected List<Sauce> sauces = new ArrayList<>();
    protected Veggie veggie = null;

    abstract public SandwichBuilder setBread();
    abstract public SandwichBuilder setCheese();
    abstract public SandwichBuilder setMeat();
    abstract public SandwichBuilder setSauces();
    abstract public SandwichBuilder setVeggie();

    public Sandwich build(){
        return new Sandwich(bread, meat, cheese, sauces, veggie);
    }
}
