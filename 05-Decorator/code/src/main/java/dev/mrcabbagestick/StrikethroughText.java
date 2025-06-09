package dev.mrcabbagestick;

public class StrikethroughText extends TextDecorator{

    public StrikethroughText(Text text) {
        super(text);
    }

    @Override
    public String asString() {
        return "~~" + text.asString() + "~~";
    }
}
