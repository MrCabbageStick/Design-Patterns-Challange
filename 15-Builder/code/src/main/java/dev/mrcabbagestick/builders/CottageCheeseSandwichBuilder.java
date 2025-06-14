package dev.mrcabbagestick.builders;

import dev.mrcabbagestick.ingredients.Bread;
import dev.mrcabbagestick.ingredients.Cheese;
import dev.mrcabbagestick.ingredients.Veggie;

public class CottageCheeseSandwichBuilder extends SandwichBuilder{

    @Override
    public CottageCheeseSandwichBuilder setBread() {
        bread = new Bread(Bread.BreadType.Wholegrain);
        return this;
    }

    @Override
    public CottageCheeseSandwichBuilder setCheese() {
        cheese = new Cheese(Cheese.CheeseType.CottageCheese);
        return this;
    }

    @Override
    public CottageCheeseSandwichBuilder setMeat() {
        return this;
    }

    @Override
    public CottageCheeseSandwichBuilder setSauces() {
        return this;
    }

    @Override
    public CottageCheeseSandwichBuilder setVeggie() {
        veggie = new Veggie(Veggie.VeggieType.Cucumber);
        return this;
    }
}
