package dev.mrcabbagestick;

public class BigHeavyObjectProxy implements IBigHeavyObject{
    private BigHeavyObject object = null;
    private String text;

    public BigHeavyObjectProxy(String text){
        this.text = text;
    }

    private BigHeavyObject getOrInstantiate(){
        if(object == null)
            object = new BigHeavyObject(text);

        return object;
    }

    @Override
    public String getText() {
        return getOrInstantiate().getText();
    }
}
