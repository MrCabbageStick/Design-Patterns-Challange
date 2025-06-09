package dev.mrcabbagestick;

public class Person implements Cloneable<Person>{

    public String name;
    private String lastname;
    private int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public Person clone() {
        return new Person(name, lastname, age);
    }
}
