package dev.mrcabbagestick;

public class DoorUser implements Observer<Door>{

    private boolean wentThroughTheDoor = false;
    private String name;

    public DoorUser(String name) {
        this.name = name;
    }

    @Override
    public void update(Door notifier) {
        if(!wentThroughTheDoor && notifier.isOpen()) {
            wentThroughTheDoor = true;
            System.out.println(name + " walked through the the door!");
        }
    }
}
