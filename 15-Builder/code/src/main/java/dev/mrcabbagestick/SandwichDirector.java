package dev.mrcabbagestick;

import dev.mrcabbagestick.builders.SandwichBuilder;

public class SandwichDirector {
    public Sandwich buildSandwich(SandwichBuilder builder){
        return builder
                .setBread()
                .setMeat()
                .setCheese()
                .setSauces()
                .setVeggie()
                .build();
    }
}
