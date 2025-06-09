package dev.mrcabbagestick;

public class BoldText extends TextDecorator{
    public BoldText(Text text) {
        super(text);
    }

    @Override
    public String asString() {
        return "**" + text.asString() + "**";
    }
}
