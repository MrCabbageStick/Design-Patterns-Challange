package dev.mrcabbagestick;

public class BigHeavyObject implements IBigHeavyObject{
    private String text;

    public BigHeavyObject(String text){
        this.text = text;
        // Some resource-heavy and time-consuming things...
        System.out.println("Instantiation of the big and heavy");
    }

    public String getText() {
        return text;
    }
}
