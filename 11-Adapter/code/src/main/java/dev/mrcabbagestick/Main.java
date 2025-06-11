package dev.mrcabbagestick;

public class Main {
    public static void main(String[] args) {
        var calc = new UsableCalculator();

        System.out.println(calc.sum(1, 2));
        System.out.println(calc.subtract(1, 2));
        System.out.println(calc.multiply(1, 2));
        System.out.println(calc.divide(1, 2));
    }
}