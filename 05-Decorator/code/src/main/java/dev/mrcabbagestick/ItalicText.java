package dev.mrcabbagestick;

public class ItalicText extends TextDecorator{

    public ItalicText(Text text) {
        super(text);
    }

    @Override
    public String asString() {
        return "*" + text.asString() + "*";
    }
}
