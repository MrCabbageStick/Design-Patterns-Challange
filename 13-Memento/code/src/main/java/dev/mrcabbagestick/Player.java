package dev.mrcabbagestick;

import java.util.HashSet;
import java.util.Set;

public class Player {
    // Constant
    private final String name;

    // Changing
    private int health;
    private int level = 0;
    private Set<String> items = new HashSet<>();

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void addItem(String item){ items.add(item); }

    public void useItem(String item){ items.remove(item); }

    public PlayerMemento createMemento(){
        return new PlayerMemento(health, level, Set.copyOf(items));
    }

    public void restoreMemento(PlayerMemento memento){
        health = memento.health();
        level = memento.level();
        items = new HashSet<>(memento.items());
    }

    public void dealDamage(int damage){
        health -= Math.min(damage, health);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public Set<String> getItems() {
        return Set.copyOf(items);
    }

    public void addLevel(int points){
        level += points;
    }
}
