package dev.mrcabbagestick;

import dev.mrcabbagestick.builders.CottageCheeseSandwichBuilder;
import dev.mrcabbagestick.builders.LeftoversSandwichBuilder;
import dev.mrcabbagestick.builders.SchoolSandwichBuilder;

public class Main {
    public static void main(String[] args) {
        var director = new SandwichDirector();

        System.out.println(director.buildSandwich(new CottageCheeseSandwichBuilder()).prettyString());
        System.out.println("\n");

        System.out.println(director.buildSandwich(new LeftoversSandwichBuilder()).prettyString());
        System.out.println("\n");

        System.out.println(director.buildSandwich(new SchoolSandwichBuilder()).prettyString());
    }
}