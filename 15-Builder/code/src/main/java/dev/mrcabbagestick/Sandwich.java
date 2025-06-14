package dev.mrcabbagestick;

import dev.mrcabbagestick.ingredients.*;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private Bread bread = null;
    private Meat meat = null;
    private Cheese cheese = null;
    private List<Sauce> sauces = new ArrayList<>();
    private Veggie veggie = null;

    public Sandwich(Bread bread, Meat meat, Cheese cheese, List<Sauce> sauces, Veggie veggie) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.sauces = sauces;
        this.veggie = veggie;
    }

    public Bread getBread() {
        return bread;
    }

    public Meat getMeat() {
        return meat;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public List<Sauce> getSauces() {
        return sauces;
    }

    public Veggie getVeggie() {
        return veggie;
    }

    public String prettyString(){
        var builder = new StringBuilder();

        if(bread != null ) builder.append("\u001B[38;5;216m").append(bread.getType().string).append('\n');

        if(veggie != null ) builder.append("\u001B[38;5;76m").append(veggie.getType().string).append('\n');

        if(!sauces.isEmpty()){
            sauces.forEach(sauce -> builder.append("\u001B[38;5;147m").append(sauce.getType().string).append('\n'));
        };

        if(cheese != null ) builder.append("\u001B[38;5;220m").append(cheese.getType().string).append('\n');

        if(meat != null ) builder.append("\u001B[38;5;130m").append(meat.getType().string).append('\n');

        if(bread != null ) builder.append("\u001B[38;5;216m").append(bread.getType().string).append('\n');

        return builder.toString();
    }
}
