package dev.mrcabbagestick;


public class Main {
    public static void main(String[] args) {
        var person = new Person("Staszek", "Fistaszek", 27);

        var person2 = person.clone();
        var person3 = person.clone();
    }
}