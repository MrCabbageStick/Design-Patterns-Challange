package dev.mrcabbagestick;

public abstract class TextDecorator implements Text{
    protected final Text text;

    public TextDecorator(Text text) {
        this.text = text;
    }

    abstract public String asString();
}
