package dev.mrcabbagestick;

public class BoldText implements Text{
    private Text text;

    public BoldText(Text text) {
        this.text = text;
    }

    @Override
    public String asString() {
        return "**" + text.asString() + "**";
    }
}
