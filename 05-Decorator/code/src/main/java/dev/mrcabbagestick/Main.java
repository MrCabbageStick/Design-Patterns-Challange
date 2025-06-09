package dev.mrcabbagestick;

public class Main {
    public static void main(String[] args) {
        var text = new PlainText("Hello there!");

        var bold = new BoldText(text);
        var italic = new ItalicText(text);
        var strike = new StrikethroughText(text);

        var bold_italic = new ItalicText(bold);
        var strike_bold_italic = new StrikethroughText(new ItalicText(new BoldText(text)));

        System.out.println(bold.asString());
        System.out.println(italic.asString());
        System.out.println(strike.asString());
        System.out.println(bold_italic.asString());
        System.out.println(strike_bold_italic.asString());
    }
}