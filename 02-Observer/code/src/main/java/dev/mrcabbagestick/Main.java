package dev.mrcabbagestick;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var doorUsers = new ArrayList<>(List.of(
                new DoorUser("Jasiek"),
                new DoorUser("Zdzisio"),
                new DoorUser("Kuba")
        ));

        var door = new Door();

        doorUsers.forEach(door::registerObserver);

        door.open();
    }
}