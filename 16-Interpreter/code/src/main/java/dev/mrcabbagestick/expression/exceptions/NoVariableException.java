package dev.mrcabbagestick.expression.exceptions;

public class NoVariableException extends Error{
    public NoVariableException(String variableId) {
        super(String.format("Unable to find variable '%s' in current context", variableId));
    }
}
