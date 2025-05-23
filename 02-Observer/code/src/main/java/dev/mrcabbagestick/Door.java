package dev.mrcabbagestick;

public class Door extends Notifier<Door>{
    private boolean isOpen = false;

    public void open(){
        isOpen = true;
        updateAll();
    }

    @Override
    protected Door getSelf() {
        return this;
    }

    public boolean isOpen() {
        return isOpen;
    }
}
