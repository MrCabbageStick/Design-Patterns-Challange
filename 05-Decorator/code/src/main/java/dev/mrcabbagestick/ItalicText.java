package dev.mrcabbagestick;

public class ItalicText implements Text{
    private Text text;

    public ItalicText(Text text) {
        this.text = text;
    }

    @Override
    public String asString() {
        return "*" + text.asString() + "*";
    }
}
