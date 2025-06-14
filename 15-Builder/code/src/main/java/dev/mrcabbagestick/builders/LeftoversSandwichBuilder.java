package dev.mrcabbagestick.builders;

import dev.mrcabbagestick.Sandwich;
import dev.mrcabbagestick.ingredients.*;

import java.util.List;

public class LeftoversSandwichBuilder extends SandwichBuilder{

    @Override
    public LeftoversSandwichBuilder setBread() {
        bread = new Bread(Bread.BreadType.White);
        return this;
    }

    @Override
    public LeftoversSandwichBuilder setCheese() {
        return this;
    }

    @Override
    public LeftoversSandwichBuilder setMeat() {
        meat = new Meat(Meat.MeatType.YesterdaysDinnerMeat);
        return this;
    }

    @Override
    public LeftoversSandwichBuilder setSauces() {
        sauces = List.of(
            new Sauce(Sauce.SauceType.Ketchup),
            new Sauce(Sauce.SauceType.Mayo),
            new Sauce(Sauce.SauceType.Mustard)
        );

        return this;
    }

    @Override
    public LeftoversSandwichBuilder setVeggie() {
        veggie = new Veggie(Veggie.VeggieType.Tomato);
        return this;
    }
}
