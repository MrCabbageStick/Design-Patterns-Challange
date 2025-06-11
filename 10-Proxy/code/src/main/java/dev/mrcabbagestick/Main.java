package dev.mrcabbagestick;

public class Main {
    public static void main(String[] args) {
        var proxy = new BigHeavyObjectProxy("Some string");
        System.out.println("Some other stuff...");

        System.out.println(proxy.getText());
    }
}