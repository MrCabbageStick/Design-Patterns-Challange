package dev.mrcabbagestick;

public class PCFan {
    private int speed = 255;
    private int color = 0x0;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "PCFan{" +
                "speed=" + speed +
                ", color=" + color +
                '}';
    }
}
