package dev.mrcabbagestick.expression;

import dev.mrcabbagestick.expression.exceptions.NoVariableException;

public class Variable<T> implements Expression<T>{
    private final String variableId;

    public Variable(String variableId) {
        this.variableId = variableId;
    }

    public String getVariableId() {
        return variableId;
    }

    @Override
    public T getValue(ExpressionContext<T> ctx) throws NoVariableException {
        var value = ctx.variables().get(variableId);

        if(value == null)
            throw new NoVariableException(variableId);

        return value;
    }
}
