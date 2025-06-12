package dev.mrcabbagestick;

public class Main {
    public static void main(String[] args) {
        var player = new Player("Steven", 100);

        player.addItem("Rock");
        player.addItem("Paper");
        player.addItem("Water bottle");

        var memento = player.createMemento();

        player.dealDamage(30);
        player.addLevel(1);
        player.useItem("Paper");
        player.addItem("Rock");

        assert player.getLevel() == 1;
        assert player.getHealth() == 70;
        assert player.getItems().size() == 1;

        player.restoreMemento(memento);

        assert player.getLevel() == 0;
        assert player.getHealth() == 100;
        assert player.getItems().size() == 3;
    }
}