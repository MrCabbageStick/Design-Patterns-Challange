package dev.mrcabbagestick;

public class StrikethroughText implements Text{
    private Text text;

    public StrikethroughText(Text text) {
        this.text = text;
    }

    @Override
    public String asString() {
        return "~~" + text.asString() + "~~";
    }
}
