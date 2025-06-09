package dev.mrcabbagestick;

public class PlainText implements Text {

    private final String text;

    public PlainText(String text) {
        this.text = text;
    }

    @Override
    public String asString() {
        return text;
    }
}
