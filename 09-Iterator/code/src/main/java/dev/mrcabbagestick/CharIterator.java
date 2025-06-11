package dev.mrcabbagestick;

public class CharIterator implements Iterator<Character>{
    private String inner;
    private int currentIndex = -1;

    public CharIterator(String inner) {
        this.inner = inner;
    }

    @Override
    public Character next() {
        if(!hasNext())
            return null;

        currentIndex++;
        return inner.charAt(currentIndex);
    }

    @Override
    public boolean hasNext() {
        return currentIndex < inner.length() - 1;
    }
}
