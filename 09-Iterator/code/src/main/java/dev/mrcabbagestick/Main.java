package dev.mrcabbagestick;


public class Main {
    public static void main(String[] args) {
        String text = "Zjadłbym pizzę";
        var chars = new CharIterator(text);

        while(chars.hasNext()){
            System.out.println(chars.next());
        }
    }
}