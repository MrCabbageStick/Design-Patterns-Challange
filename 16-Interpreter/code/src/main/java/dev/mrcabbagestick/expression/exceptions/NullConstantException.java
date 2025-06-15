package dev.mrcabbagestick.expression.exceptions;

public class NullConstantException extends Error{
    public NullConstantException() {
        super("Constant has a null value");
    }
}
