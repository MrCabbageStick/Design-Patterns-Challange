package dev.mrcabbagestick.builders;

import dev.mrcabbagestick.Sandwich;
import dev.mrcabbagestick.ingredients.*;

import java.util.List;

public class SchoolSandwichBuilder extends SandwichBuilder{

    @Override
    public SchoolSandwichBuilder setBread() {
        bread = new Bread(Bread.BreadType.White);
        return this;
    }

    @Override
    public SchoolSandwichBuilder setCheese() {
        cheese = new Cheese(Cheese.CheeseType.AmericanCheese);
        return this;
    }

    @Override
    public SchoolSandwichBuilder setMeat() {
       meat = new Meat(Meat.MeatType.SlicedHam);
        return this;
    }

    @Override
    public SchoolSandwichBuilder setSauces() {
        sauces = List.of(new Sauce(Sauce.SauceType.Mayo));
        return this;
    }

    @Override
    public SchoolSandwichBuilder setVeggie() {
        veggie = new Veggie(Veggie.VeggieType.Salad);
        return this;
    }


}
